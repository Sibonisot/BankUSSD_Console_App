public class CurrentAccount extends Account{

    // Default transaction fee
    private static double FEE = 5.2;

    public CurrentAccount() {
    }

    public CurrentAccount(int accountNumber, String accountName, double balance, double fee) {
        super(accountNumber, accountName, balance);
        FEE = fee;
    }

    public CurrentAccount(int accountNumber, double fee) {
    }

    // Method to deposit fees

    public void deposit(double amount, double FEE) {

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

    public void withdraw(double amount, double FEE) {
        // Check amount
        if(amount > 0){
            if ((amount + FEE ) <= balance ){

                System.out.printf("Amount of %.2f withdrawn from Account%n", amount);
                balance -= amount;
                balance -= FEE;
                System.out.printf("Fee of %.2f applied%n", FEE);
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
