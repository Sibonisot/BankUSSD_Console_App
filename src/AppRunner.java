import java.io.Console;
import java.util.Scanner;

public class AppRunner {
    public static void main(String[] args) {

        new UserAccount();

        /*Scanner keyboard = new Scanner(System.in);

        // Create array of Accounts
        Account account[] = new Account[10];
        int numAccounts = 0;
        int choice;

        do {
            choice = menu(keyboard);
            System.out.println();
            if (choice == 1) {
                account[numAccounts++] = createAccount(keyboard);
            }else if(choice == 2) {
                doDeposit(account, numAccounts, keyboard);
            }else if (choice == 3) {
                doWithdrawal(account, numAccounts, keyboard);
            }else if (choice == 4) {
                applyInterest(account, numAccounts, keyboard);
            } else  {
                System.out.println("Good Bye!");
            }
            System.out.println();

        } while (choice != 5);

    }
    public static int searchAccount(Account accounts[], int count, int accountNumber){
        for (int i=0; i<count; i++){
            if(accounts[i].getAccountNumber() == accountNumber){
                return i;
            }
        }
        return  -1;

    }

    *//**
         * Function to perform deposit on selected account
         * @param accounts
         * @param count
         * @param keyboard
         *//*
    public static void doDeposit(Account accounts[], int count, Scanner keyboard){

        //Get account number
        System.out.print("\nPlease enter account number: ");
        int accountNumber = keyboard.nextInt();

        // search account
        int index = searchAccount(accounts, count, accountNumber);
        if (index >= 0) {
            // Enter deposit amount
            System.out.println("Please enter Deposit Amount");
            double amount = keyboard.nextDouble();

            accounts[index].deposit(amount);
        }else {
            System.out.println("No account exist with Account Number: " + accountNumber);

        }

    }

    *//**
         * Function to perform withdrawal amount
         * @param accounts
         * @param count
         * @param keyboard
         *//*

    public static void doWithdrawal(Account accounts[], int count, Scanner keyboard){
        //Get account number
        System.out.print("\nPlease enter account number: ");
        int accountNumber = keyboard.nextInt();

        // search account
        int index = searchAccount(accounts, count, accountNumber);
        if (index >= 0) {
            // Enter deposit amount
            System.out.println("Please enter amount to withdraw");
            double amount = keyboard.nextDouble();

            accounts[index].deposit(amount);
        }else {
            System.out.println("No account exist with Account Number: " + accountNumber);

        }
    }

    public static void applyInterest(Account accounts[], int count, Scanner keyboard){
        //Get account number
        System.out.print("\nPlease enter account number: ");
        int accountNumber = keyboard.nextInt();

        // search account
        int index = searchAccount(accounts, count, accountNumber);
        if (index >= 0) {
            // must be instanced of saving account
            if (accounts[index] instanceof SavingsAccount){
                ((SavingsAccount)accounts[index]).applyInterest();
            }


        }else {
            System.out.println("No account exist with Account Number: " + accountNumber);

        }

    }



    *//**
         * Menu to display account selection
         * @param keyboard
         * @return choice
         *//*
    public static int accountMenu(Scanner keyboard){
        System.out.println("Select Account Type:");
        System.out.println("1. Current Account");
        System.out.println("2. Savings Account");

        int choice;
        do {
            System.out.println("Enter choice: ");
            choice = keyboard.nextInt();
        } while(choice < 1 || choice > 2);

        return choice;
    }

    *//**
         * Function to create a new Account
         * @param keyboard
         * @return Account
         *//*
    public  static Account createAccount(Scanner keyboard){
        Account account = null;
        int choice = accountMenu(keyboard);

        int accountNumber;
        System.out.print("Enter account number: ");
        accountNumber = keyboard.nextInt();

        if(choice == 1) {// current account
            System.out.print("Enter Transaction Fee");
            double fee = keyboard.nextDouble();
            account = new CurrentAccount(accountNumber, fee);
        }else { // savings account
            System.out.print("Please enter Interest rate: ");
            double ir = keyboard.nextDouble();
            account = new SavingsAccount(accountNumber, ir);
            }

        return account;

        }

    *//**
         * Menu to display options and get user selection
         * @param keyboard
         * @return
         *//*
    public static int menu(Scanner keyboard){
        System.out.println("Bank Account Menu");
        System.out.println("1. Login");
        System.out.println("2. Check balance");
        System.out.println("3. Send cash");
        System.out.println("4. Make payment");
        System.out.println("5. Buy Airtime");
        System.out.println("6. Buy Electricity");
        System.out.println("7. View transaction history");
        System.out.println("8. Quit");

        int choice;
        do {
            System.out.print("Enter choice: ");
            choice = keyboard.nextInt();
        } while (choice < 1 || choice > 8);

        return choice;

    }
*/
        //Console console = System.console();
        //if (console != null){
        //console.writer().println("We have a console");
        //Scanner id_scanner = new Scanner(console.reader());
        //System.out.println("Please enter your name: ");
//            User userID = new User;
//            String userName = id_scanner.nextLine();
//            Scanner pw_scanner = new Scanner(console.reader());
//            System.out.println("Please enter your password: ");
//            char[] password = console.readPassword();
//            String passwordstr = new String(password);
//            System.out.println("Welcome to USSD Banking " + userID + ". Your password is " + passwordstr);
        // }
        // else {
        // System.out.println("We do not have console");
        // }
    }
}