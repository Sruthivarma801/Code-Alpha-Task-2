import java.util.Scanner;

public class SimpleBankingApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0.0;
        boolean running = true;

        System.out.println("Welcome to the Simple Banking Application!");

        while (running) {
            System.out.println("\nPlease select an option:");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to deposit: ");
                    double deposit = scanner.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("You have successfully deposited $" + deposit);
                    } else {
                        System.out.println("Invalid amount. Please try again.");
                    }
                    break;

                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawal = scanner.nextDouble();
                    if (withdrawal > 0 && withdrawal <= balance) {
                        balance -= withdrawal;
                        System.out.println("You have successfully withdrawn $" + withdrawal);
                    } else {
                        System.out.println("Invalid amount or insufficient funds.");
                    }
                    break;

                case 3:
                    System.out.println("Your current balance is: $" + balance);
                    break;

                case 4:
                    running = false;
                    System.out.println("Thank you for using the Simple Banking Application. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
