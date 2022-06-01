package Exercise3;

public class SavingsAccount extends Account{
    protected double rate;

    public SavingsAccount(int a, double rate) {
        super(a);
        this.rate = rate;
    }

    public void addInterest() {
        double newBalance = getBalance() + ((rate * getBalance()) / 100);
        deposit(newBalance);
    }

    @Override
    public String toString() {
        return super.toString() + "  " + "rate = " + rate;
    }
}


