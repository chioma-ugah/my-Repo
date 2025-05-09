import java.util.Scanner;

public class ATM {
    static double balance = 1000.00; 
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n1. Check Balance\n2. Deposit\n3. Withdraw\n4. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1: checkBalance(); break;
                case 2: deposit(); break;
                case 3: withdraw(); break;
                case 4: System.out.println("Goodbye!"); break;
                default: System.out.println("Invalid option.");
            }
        } while (choice != 4);
    }

    static void checkBalance() {
        System.out.println("Your balance is: ₦" + balance);
    }

    static void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful!");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    static void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }
}