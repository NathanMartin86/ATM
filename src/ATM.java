import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by macbookair on 10/9/15.
 */
public class ATM {
    public static void main (String[] args )throws Exception {
        HashMap<String, Double> accounts = new HashMap();//note the Syntax for creating the HashMap
        while (true) {
            System.out.println("What is your name?");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            if (name.equals("")) {
                throw new Exception("ERROR");
            }


            if (!accounts.containsKey(name)) {
                System.out.println("No Account Recognized, Would you like to create an account? [y/n]");
                String choice = scanner.nextLine();
                if (choice.equals("y")) {
                    accounts.put(name, 100.0);
                }//note the code for adding to the HashMap. Also note that "name" is the object key.

                if (choice.equals("n")){
                    System.out.println("Thank you, Have a nice Day");
                        System.exit(0);
                    }

            }
            else if (accounts.containsKey(name)){
                System.out.println("Welcome Back" +" "+ name+"!");//This only occurs when it is a returning user.
            }


                System.out.println("Would you like to..");
                System.out.println("[1] Check your balance");
                System.out.println("[2] Withdraw Funds");
                System.out.println("[3] Cancel");
                System.out.println("[4] Remove My Account");
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
                else if (option.equals("3")) {
                    System.out.println("Thank you, Have a nice Day");
                    System.exit(0);
                }
                else if (option.equals("4")){
                    System.out.println("Are you sure you want to remove your account "+ name + "? [y/n]");
                    String cancel = scanner.nextLine();
                    if (cancel.equals("y")) {
                        accounts.remove(name);
                    }
                        else if (cancel.equals("n")){
                        System.out.println("Thank you, Have a nice Day");
                        System.exit(0);
                    }

                }

            }
        }

    }


