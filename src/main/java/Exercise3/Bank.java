package Exercise3;

import java.util.Scanner;
public class Bank{

    protected Account[] listOfAccounts;
    SavingsAccount saveAcc;
    CurrentAccount currentAcc;
    Account account;


    public Account openBankAccount() {
        System.out.println("Choose a bank Account 1 : saving Account , 2: Current Account");
        Scanner choiceOfBank = new Scanner(System.in);
        String accounttype = choiceOfBank.nextLine();

        if (accounttype.equals("1")) {
            SavingsAccount account = new SavingsAccount(12345, 1.2);
            return account;
        } else if (accounttype.equals("2")) {
            CurrentAccount account = new CurrentAccount(98765, -5000);
            return account;

        } else {
            return null;
        }

    }

    public void closeBankAccount() {

    }

    public void updateAcc(Account account) {
        if (account == saveAcc) {
            saveAcc.addInterest();
        }
        if (account == currentAcc) {
            currentAcc.getLetter();
        }
    }

    public Account[] getListOfAccounts() {
        return listOfAccounts;
    }

    public void setListOfAccounts(Account account1, SavingsAccount account2, CurrentAccount account3) {
        this.listOfAccounts = new Account[]{account1, account2, account3};

    }

    public void payDividend(Account accToPayDividend){
        double dividendToPay = 1000;
        final double newBalance = accToPayDividend.getBalance() + dividendToPay;
        accToPayDividend.deposit( newBalance) ;
    }

}

