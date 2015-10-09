import java.util.Scanner;

/**
 * Created by macbookair on 10/9/15.
 */
public class ATM {
    public static void run() throws Exception {
        System.out.println("What is your name?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if (name.equals("")) {
            throw new Exception("ERROR");
        }
        System.out.println("Welcome," + name);


        System.out.println("Would you like to..");
        System.out.println("[1] Check your balance");
        System.out.println("[2] Withdraw Funds");
        System.out.println("[3] Cancel");
        String option = scanner.nextLine();
        if (option.equals("1")) {
            System.out.println("Your Balance is $1000");
        } else if (option.equals("2")) {
            System.out.println("How much do you want to withdraw?");
            String amount = scanner.nextLine();
            int amountNum = Integer.valueOf(amount);
            if (amountNum < 100) {
                System.out.println("Thank You, Have a Nice Day");
            } else if (amountNum > 100) {
                System.out.println("You have exceeded your withdrawal limit");
            }

        }if (option.equals("3")){
            System.out.println("Thanks you, Have a nice Day");
        }
    }
}
