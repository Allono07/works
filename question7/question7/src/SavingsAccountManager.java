

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class SavingsAccountManager {
    public SavingsAccountManager() {
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number of customers: ");
        int numCustomers = Integer.parseInt(reader.readLine());
        LinkedList<Integer> balances = new LinkedList();

        for(int i = 0; i < numCustomers; ++i) {
            System.out.print("Enter the name of customer " + (i + 1) + ": ");
            reader.readLine();
            balances.add(0);
        }

        while(true) {
            StringBuilder menu = new StringBuilder();
            menu.append("1. Deposit\n");
            menu.append("2. Withdraw\n");
            menu.append("3. Check balance\n");
            menu.append("4. Exit\n");

            try {
                menu.append("Enter your choice: ");
                System.out.print(menu);
                int choice = Integer.parseInt(reader.readLine());
                if (choice > 4 || choice == 4) {
                    if (choice == 4) {
                        System.out.println("No transaction happened,Exiting the transaction, Thankyou for your service");
                        return;
                    }

                    System.out.println("Invalid Input");
                    System.out.println(menu);
                }

                System.out.print("Enter the account number: ");
                int accountNum = Integer.parseInt(reader.readLine());
                if (accountNum >= 1 && accountNum <= numCustomers) {
                    int balance = (Integer)balances.get(accountNum - 1);
                    switch (choice) {
                        case 1:
                            System.out.print("Enter the amount to deposit: ");
                            int depositAmount = Integer.parseInt(reader.readLine());
                            balance += depositAmount;
                            StringBuilder depositMsg = new StringBuilder();
                            depositMsg.append("Amount deposited successfully\n");
                            depositMsg.append("New balance: ").append(balance).append("\n");
                            System.out.print(depositMsg);
                            break;
                        case 2:
                            System.out.print("Enter the amount to withdraw: ");
                            int withdrawAmount = Integer.parseInt(reader.readLine());
                            if (withdrawAmount > balance) {
                                System.out.println("Insufficient balance");
                                continue;
                            }

                            balance -= withdrawAmount;
                            StringBuilder withdrawMsg = new StringBuilder();
                            withdrawMsg.append("Amount withdrawn successfully\n");
                            withdrawMsg.append("New balance: ").append(balance).append("\n");
                            System.out.print(withdrawMsg);
                            break;
                        case 3:
                            StringBuilder balanceMsg = new StringBuilder();
                            balanceMsg.append("Balance: ").append(balance).append("\n");
                            System.out.print(balanceMsg);
                            break;
                        default:
                            System.out.println("Invalid choice");
                    }

                    balances.set(accountNum - 1, balance);
                } else {
                    System.out.println("Invalid account number");
                }
            } catch (NumberFormatException var13) {
                System.out.println("Enter the input again");
                System.out.println(menu);
            }
        }
    }
}
