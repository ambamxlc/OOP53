public class BankAccount {
    private String name;
    private double balance;
    private int acctNumber;

    public BankAccount(String custName, int accountBal, int accNumb) {
        this.name = custName;
        this.balance = accountBal;
        this.acctNumber = accNumb;
    }

    public BankAccount() {}

    public String getName() { 
        return this.name; 
    }
    public void setName(String name) { 
        this.name = name; 
    }

    public double getBalance() { 
        return this.balance; 
    }
    public void setBalance(double balance) { 
        this.balance = balance; 
    }

    public int getAcctNumber() { 
        return this.acctNumber; 
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
    }

    public void withdrawal(double withdrawalAmount) {
        this.balance -= withdrawalAmount;
    }

    public void transfer(BankAccount targetAcct, double transferAmount) {
        withdrawal(transferAmount);
        targetAcct.deposit(transferAmount);
    }

    @Override
    public String toString() {
        return "Account # " + getAcctNumber() + " and it belongs to " + getName() + " and the balnc is $ " + getBalance();
    }
}