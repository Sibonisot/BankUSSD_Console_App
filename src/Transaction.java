public class Transaction {
    private String transactionID;
    private String accountNumber;
    private double debit;
    private double credit;

    Transaction(String transactionID, String accountNumber, double debit, double credit){
        this.transactionID = accountNumber;
        this.accountNumber = accountNumber;
        this.debit = debit;
        this.credit = debit;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getDebit() {
        return debit;
    }

    public void setDebit(double debit) {
        this.debit = debit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
}
