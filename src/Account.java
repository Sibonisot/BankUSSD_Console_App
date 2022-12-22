import java.util.Scanner;

public abstract class Account {

    private int accountNumber;
    private  String accountName;
    public static double balance = 10000;

    public Account() {


    }

    public static int accountMenu() {

        int selection;
        Scanner input = new Scanner(System.in);

        /***************************************************/

        System.out.println("Select account");
        System.out.println("========================\n");
        System.out.println("1. Current Account");
        System.out.println("2. Savings Account");
        System.out.println("4 - Quit");

        selection = input.nextInt();
        return selection;
    }

    public Account(int accountNumber, String accountName, double balance){
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Abstract

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);


}