import java.util.Scanner;
import java.lang.Thread;

public class orionBankSystem {

// TODO: 16/02/2024
    // make savings interface re-route back to main, upon exit of savings
    // implement JUnit tests too, if i have time

    static double balance = 0;
    static double savings = 0;


    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        while (option != 5) {
            System.out.println("\nWelcome to the Bank of Orion!\n");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Manage Savings");
            System.out.println("5. Exit");
            System.out.print("\nEnter an option:\n ");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> checkBalance();
                case 2 -> deposit();
                case 3 -> withdraw();
                case 4 -> manageSavings();
                case 5 -> exit();
                default -> System.out.println("Invalid option. Try again.");
            }
        }
    }

    public static void checkBalance() {
        System.out.println("Your current balance is $" + balance);
    }

    public static void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to deposit: $");
        double amount = scanner.nextDouble();
        balance += amount;
        System.out.println("$" + amount + " has been deposited to your account.");
        checkBalance();
    }

    public static void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw: $");
        double amount = scanner.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient funds... We're a fun bank, we don't like debt :) ");
        } else {
            balance -= amount;
            System.out.println("$" + amount + " has been withdrawn from your account.");
        }
        checkBalance();
    }

        public static void manageSavings() throws InterruptedException {
        Scanner scanner = new Scanner (System.in);
        int option = 0;
        while (option != 3) {
            System.out.println("1. Check Savings Balance");
            System.out.println("2. Deposit to Savings");
            System.out.println("3. Exit to main menu");
            System.out.println("Enter an option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    checkSavingsBalance();
                    break;
                case 2:
                    depositToSavings();
                    break;
                case 3:
                    System.out.println("Returning to the main menu...");
                    Thread.sleep(2000);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
    public static void checkSavingsBalance() {
        System.out.println("Your savings balance is $" + savings);
    }
    public static void depositToSavings() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount to deposit to savings: $");
        double amount = scanner.nextDouble();
        System.out.println("$" + amount + " had been deposited to your savings account.");
        savings += amount;
        checkSavingsBalance();
    }
    public static void exit() {
        System.out.println("Thank you for banking with Orion. Have a great day!");
    }
}


