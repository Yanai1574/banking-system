import java.util.Scanner;

public class User {

    private int userchoice;

    Scanner scanner = new Scanner(System.in);

    public User(int userChoice) {
        this.userchoice = userChoice;
    }

    public void showMenuResponse() {

        Transaction transaction = new Transaction(0); // ליצור העברה חדשה 

        if (userchoice == 1) {

            System.out.println(transaction.getBankBalance()); 

        } else if (userchoice == 2) {

            System.out.println("How much would you like to depo?");
            double amount = scanner.nextDouble();

            transaction.deposit(amount);

            System.out.println("New balance: " + transaction.getBankBalance());

        } else if (userchoice == 3) {

            System.out.println("How much would you like to withdraw?");
            double amount = scanner.nextDouble(); // יצירת משתנה העברה

            transaction.withdraw(amount);

            System.out.println("New balance: " + transaction.getBankBalance());

        } else if (userchoice == 4) {
            transaction.makeZero();

        } else {

            System.out.println("Typo");
        }
    }
}