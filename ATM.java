import java.util.Scanner;

class ATM {
    private int pin = 1234;
    private double balance = 5000;

    public boolean authenticate(int enteredPin) {
        return pin == enteredPin;
    }

    public void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Please collect your cash.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}
