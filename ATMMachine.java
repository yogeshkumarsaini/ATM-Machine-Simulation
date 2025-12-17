import java.util.Scanner;

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
