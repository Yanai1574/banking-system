import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        System.out.println("welcome to the bank!");
        System.out.println("what would you like to do? (1) check balance (2) deposit (3) withdraw (4) make it zero");

        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();

        User user = new User(userChoice);
        user.showMenuResponse();
    }
}