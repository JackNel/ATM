import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Jack on 10/8/15.
 */
public class ATM {


    public static void main(String[] args) throws Exception {

            HashMap<String, Double> accounts = new HashMap();

        while (true) {

            System.out.println("Welcome to the ATM.");
            System.out.println("What is your name?");

            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            if (name.length() == 0) {
                throw new Exception("Not a valid name.");
            } else {
                if (!accounts.containsKey(name)) {
                    System.out.println("Hello " + name + ", Would you like to create a new account? [y/n]");
                    String create = scanner.nextLine();
                    if (create.equals("y")) {
                        accounts.put(name, 100.00);
                        System.out.println("New Account created, your current balance is $100.00");
                    } else if (create.equals("n")) {
                        System.out.println("Thank you, have a good day!");
                        continue;
                    } else {
                        System.out.println("Not a valid option");
                        continue;
                    }
                }
            }

            System.out.println("Hello " + name + ",  What would you like to do today?");

            double balance = accounts.get(name);
            System.out.println("[1] Check my balance");
            System.out.println("[2] Withdraw Funds");
            System.out.println("[3] Cancel");
            System.out.println("[4] Delete Bank Account");
            String choice = scanner.nextLine();
            int choiceNum = Integer.valueOf(choice);
            if (choiceNum == 1) {
                System.out.println("Your balance is $" + balance);

            } else if (choiceNum == 3) {
                System.out.println("Thank you and please come again.");
                System.exit(0);

            } else if (choiceNum == 2) {
                System.out.println("How much money would you like to withdraw?");
                String amount = scanner.nextLine();
                int amountNum = Integer.valueOf(amount);
                if (amountNum > balance) {
                    System.out.println("ATM currently only has $" + balance);
                    continue;
                } else if (amountNum <= balance) {
                    double newBal = (balance - amountNum);
                    accounts.put(name, newBal);
                    System.out.println("Your balance is now $" + (balance - amountNum));
                    System.out.println("Please take your money.");
                }

            } else if (choiceNum == 4) {
                System.out.println("Please enter the name of your account.");
                String n = scanner.nextLine();
                if (accounts.containsKey(n)) {
                    accounts.remove(n);
                    System.out.println("Account name: " + n + " has been deleted");
                } else {
                    System.out.println(n + " is not an existing account.");
                }
            }
        }
    }
}
