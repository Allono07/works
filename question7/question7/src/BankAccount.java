public abstract class BankAccount {
    protected String accountNumber;
    protected String accountHolderName;
    protected double balance;
    protected String accountType;

    public BankAccount(String accountNumber, String accountHolderName, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String getAccountHolderName() {
        return this.accountHolderName;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getAccountType() {
        return this.accountType;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Amount deposited successfully");
    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Insufficient balance");
        } else {
            this.balance -= amount;
            System.out.println("Amount withdrawn successfully");
        }

    }

    public void checkBalance() {
        System.out.println("Balance: " + this.balance);
    }
}
