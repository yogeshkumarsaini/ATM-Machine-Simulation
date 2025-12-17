# ATM Simulation in Java

This is a simple Java program that simulates basic ATM machine operations on the command line. It demonstrates object-oriented principles along with conditionals, loops, and user input handling in Java.

---

## 🔹 Features

- **PIN authentication**
- **Withdraw money**
- **Deposit money**
- **Balance check**
- **Exit option**

---

## 🔹 Concepts Used

- OOP (Classes & Objects)
- Conditionals
- Loops
- Scanner input

---

## 📌 Java Code – ATM Simulation

<details>
<summary>Click to expand the Java code</summary>

```java
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

public class ATMMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM();

        System.out.print("Enter PIN: ");
        int enteredPin = sc.nextInt();

        if (!atm.authenticate(enteredPin)) {
            System.out.println("Invalid PIN. Access denied.");
            return;
        }

        int choice;
        do {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    atm.deposit(sc.nextDouble());
                    break;
                case 3:
                    System.out.print("Enter withdraw amount: ");
                    atm.withdraw(sc.nextDouble());
                    break;
                case 4:
                    System.out.println("Thank you for using ATM.");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (choice != 4);

        sc.close();
    }
}
```
</details>

---

## 🚀 How to Run

1. **Copy the code** into a file named `ATMMachine.java`.
2. **Compile the program:**
   ```bash
   javac ATMMachine.java
   ```
3. **Run it:**
   ```bash
   java ATMMachine
   ```

---

## 📝 Notes

- **Default PIN:** 1234
- **Initial Balance:** ₹5000
- This project is for learning and demonstration purposes only.
