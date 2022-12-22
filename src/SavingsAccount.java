public class SavingsAccount extends Account {
    private int accountNumber;
    protected double interestRate;

    public SavingsAccount() {
    }

    public SavingsAccount(int accountNumber, String accountName, double balance, double interestRate) {
        super(accountNumber, accountName, balance);
        this.interestRate = interestRate;
    }

    public SavingsAccount(int accountNumber, double ir) {
    }

    @Override
    public int getAccountNumber() {
        return accountNumber;
    }

    @Override
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double calcInterestRate(double balance){
        return balance * interestRate;
    }

    public void applyInterest(double balance){
        double interest = calcInterestRate(balance);
        System.out.printf("Interest amount %.2f added to balance%n", balance);
        deposit(interest);
    }

    // Method to deposit fees

    public void deposit(double amount, double FEE, double balance) {

        // Check amount

        if (amount > 0){
            // Check amount
            balance += amount;
            System.out.printf("Amount %.2f deposited%n", amount);
            System.out.printf("Your current balance is: %.2f%n", balance);
        } else {
            System.out.println("A negative amount cannot be deposited");
        }
    }

    public void withdraw(double amount, double FEE, double balance) {
        // Check amount
        if(amount > 0){
            if ((amount) <= balance ){

                balance += amount;
                System.out.printf("Amount of %.2f withdrawn from Account%n", amount);
                System.out.printf("Current balance is:%.2f%n", balance);

            }

        }else {
            System.out.println("You have insufficient funds");
        }
    }

    @Override
    public void deposit(double amount) {

    }

    @Override
    public void withdraw(double amount) {

    }
}
