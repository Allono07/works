public class SavingsAccount extends BankAccount {
    private double interestRate;
    private boolean isInterestCompoundedMonthly;



    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }




    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public boolean isInterestCompoundedMonthly() {
        return isInterestCompoundedMonthly;
    }

    public void setInterestCompoundedMonthly(boolean interestCompoundedMonthly) {
        this.isInterestCompoundedMonthly = interestCompoundedMonthly;
    }


}
