import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SavingsAccountManager {
    public static void main(String[] args) {
        int n=0;

        Scanner sc = new Scanner(System.in);
        ArrayList<SavingsAccount> savingsAccounts = new ArrayList<>();
        for(int i=0;i<1;i++){
            SavingsAccount savingsAccount = new SavingsAccount();
            System.out.println("Enter the account holder name");
            savingsAccount.setAccountHolderName(sc.next());
            System.out.println("Enter the account number");
            savingsAccount.setAccountNumber(sc.nextInt());
            System.out.println("Enter the account tyoe");
            savingsAccount.setAccountType(sc.next());
            savingsAccounts.add(savingsAccount);
        }
        for(SavingsAccount savingsAccount : savingsAccounts) {
            System.out.println("Enter the account number to check");

            try{
                 n = sc.nextInt();
            }
            catch (InputMismatchException e) {
                String message = e.getMessage();
                System.out.println("Invalid input. " + message);
            }
            finally {
                System.out.println("The program will be executed with the condition");
            }
            if (savingsAccount.getAccountNumber()==n) {
                System.out.println();
                System.out.println("Name:" + savingsAccount.getAccountHolderName());
                System.out.println("Id:" + savingsAccount.getAccountNumber());
                System.out.println("account Tyepw " + savingsAccount.getAccountType());
            }
            else {
                System.out.println("The account is not present");
                break;
            }
        }
    }
}

