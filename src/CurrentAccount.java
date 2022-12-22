import java.util.Scanner;

public class CurrentAccount extends Account{

    // Default transaction fee


    //private static double FEE = 5.2;

    public CurrentAccount() {
        
        
    }

    static Scanner sc = new Scanner(System.in);

    public static void userInput(double balance) {

        Scanner moneyTime = new Scanner(System.in);

        int dep;
        int with;
        //int balance = 1200;
        int choice;

        while (1 == 1) {
            System.out.println(" ");
            System.out.printf("%s%.2f%n", "Current Balance: R" , balance);
            System.out.println(" ");
            System.out.println("Please select options:");
            System.out.println("1. Send Cash");
            System.out.println("2. Make payment");
            System.out.println("3. Buy Airtime");
            System.out.println("4. Buy Electricity");
            System.out.println("5. View transaction history");
            System.out.println("6. Quit");
            choice = moneyTime.nextInt();

            if (choice == 1) {
                CurrentAccount.sendCash1();
            } else if (choice == 2) {
                System.out.print("Amount: ");
                with = moneyTime.nextInt();
                withdrawal(balance, with);
                System.out.println("Testing2: " + balance);
            } else {
                new CurrentAccount();
            }
        }


//        static int deposit ( int balance, int dep){
//            int balance1 = balance + dep;
//            return balance1;
//        }
//
//        static int withdrawal ( int balance, int with){
//            int balance1 = balance - with;
//            return balance1;
//        }

    }

    private static void withdrawal(double balance, int with) {
    }

    public static void doDeposit(Account accounts[], int count, Scanner keyboard){

        //Get account number
        System.out.print("\nPlease enter account number: ");
        int accountNumber = keyboard.nextInt();

        // search account
        int index = AppRunner.searchAccount(accounts, count, accountNumber);
        if (index >= 0) {
            // Enter deposit amount
            System.out.println("Please enter Deposit Amount");
            double amount = keyboard.nextDouble();

            accounts[index].deposit(amount);
        }else {
            System.out.println("No account exist with Account Number: " + accountNumber);

        }

    }


    public CurrentAccount(int accountNumber, String accountName, double balance) {
        super(accountNumber, accountName, balance);
    }

    public CurrentAccount(int accountNumber, double fee) {
    }

    // Method to deposit fees

    public static void deposit(double amount, double FEE) {

        // Check amount

        if (amount > 0){
            // Check amount
            balance += amount;

            // Transaction fee
            balance -= FEE;

            System.out.printf("Amount %.2f deposited%n", amount);
            System.out.printf("Fee %2f Applied%n", FEE);
            System.out.printf("Your current balance is: %.2f%n", balance);
        } else {
            System.out.println("A negative amount cannot be deposited");
        }
    }

    public static void sendCash() {
        // Check amount
        double amount = 0;
        if(amount > 0){
            if ((amount) <= balance ){

                System.out.printf("Amount of %.2f withdrawn from Account%n", amount);
                balance -= amount;
                System.out.printf("Current balance is:%.2f%n", balance);

            }

        }else {
            System.out.println("You have insufficient funds");
        }
    }

    public static void sendCash1() {
        long amt;

        //String amount = sc.nextLine();
        System.out.println("Enter the beneficiary name: ");
        String bName = sc.nextLine();
        System.out.println("Enter the amount you want to send: ");
        amt = sc.nextLong();
        if (balance >= amt){
            System.out.println("Sent R" + amt + " to " +  bName );
        }
        if (balance >= amt) {
            balance = balance - amt;
            System.out.println("Balance after sending cash: " + balance);
        } else {
            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );
        }
    }

    public static void sendCash1(Account accounts[], int count, Scanner keyboard){
        //Get account number
        //System.out.print("\nPlease enter account number: ");
        int accountNumber = keyboard.nextInt();

        // search account
        int index = AppRunner.searchAccount(accounts, count, accountNumber);
        if (index >= 0) {
            // Enter deposit amount
            System.out.println("Please enter amount to withdraw");
            double amount = keyboard.nextDouble();

            accounts[index].deposit(amount);
        }else {
            System.out.println("No account exist with Account Number: " + accountNumber);

        }
    }


    @Override
    public void deposit(double amount) {

    }

    @Override
    public void withdraw(double amount) {

    }
}
