import java.util.Scanner;

/**
 * Created by Jack on 10/8/15.
 */
public class ATM {
    public static void run() throws Exception {
        System.out.println("Welcome to the ATM.");
        System.out.println("What is your name?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if (name.length() == 0) {
            throw new Exception("Not a valid name.");
        } else {
            System.out.println("Hello " + name + ", what would you like to do today?");
        }
        System.out.println("[1] Check my balance");
        System.out.println("[2] Withdraw Funds");
        System.out.println("[3] Cancel");
        String choice = scanner.nextLine();
        int choiceNum = Integer.valueOf(choice);
        if (choiceNum == 1) {
            System.out.println("Your balance is $100");

        } else if (choiceNum == 3) {
            System.out.println("Thank you and please come again.");

        } else if (choiceNum == 2) {
            System.out.println("How much money would you like to withdraw?");
            String amount = scanner.nextLine();
            int amountNum = Integer.valueOf(amount);
            if (amountNum > 100) {
                throw new Exception("ATM currently only has $100.");
            } else if (amountNum <= 100) {
                    System.out.println("Your balance is now $" + (100 - amountNum));
                    System.out.println("Please take your money.");
                }

        }


    }
}
