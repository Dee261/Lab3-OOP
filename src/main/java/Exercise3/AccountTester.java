package Exercise3;

public class AccountTester {
    public static void main(String[] args){
    Bank bank1 = new Bank();
    System.out.println(bank1.getListOfAccounts());
    Account acc1 = bank1.openBankAccount();
    acc1.deposit(10000);
    bank1.payDividend(acc1);
    acc1.withdraw(30000);
    bank1.updateAcc(acc1);
    System.out.println(acc1.toString());
    }

}
