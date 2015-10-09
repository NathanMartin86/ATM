import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by macbookair on 10/9/15.
 */
public class ATM {
    public static void run() throws Exception {
        HashMap<String, Double> accounts = new HashMap();//note the Syntax for creating the HashMap
        while (true) {
            System.out.println("What is your name?");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            if (name.equals("")) {
                throw new Exception("ERROR");
            }


            if (!accounts.containsKey(name)) {
                System.out.println("No Account Recognized, But Don't Worry We've Created an Account for You");
                accounts.put(name, 100.0);//note the code for adding to the HashMap. Also note that 'name' is the object key.

            }
            else if (accounts.containsKey(name)){
                System.out.println("Welcome Back" + ""+ name+"!");
            }


                System.out.println("Would you like to..");
                System.out.println("[1] Check your balance");
                System.out.println("[2] Withdraw Funds");
                System.out.println("[3] Cancel");
                String option = scanner.nextLine();

                double balance = accounts.get(name);// This actually retrieves the balance.In this case 'name' is the object key. So even if you wanted the double from the Hashmap, you stil input the name.

                if (option.equals("1")) {
                    System.out.println("Your Balance is " + balance);
                } else if (option.equals("2")) {
                    System.out.println("How much do you want to withdraw?");
                    String amount = scanner.nextLine();
                    int amountNum = Integer.valueOf(amount);//Creation of AmountNum int
                    if (amountNum < balance) {
                        System.out.println("Thank You, Have a Nice Day");
                        accounts.put(name, balance - amountNum);
                    } else if (amountNum > balance) {
                        System.out.println("You have exceeded your withdrawal limit");
                    }

                }
                if (option.equals("3")) {
                    System.out.println("Thank you, Have a nice Day");
                    System.exit(0);
                }

            }
        }

    }