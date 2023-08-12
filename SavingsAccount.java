public class SavingsAccount extends BankAccount {
    private double interestRate;
    private boolean isInterestCompoundedMonthly;


    public SavingsAccount() {
        super();
    }

    public SavingsAccount(int accountNumber, String accountHolderName, double balance, String accountType,
                          double interestRate, boolean isInterestCompoundedMonthly) {
        super(accountNumber, accountHolderName, balance, accountType);
        this.interestRate = interestRate;
        this.isInterestCompoundedMonthly = isInterestCompoundedMonthly;
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
