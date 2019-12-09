package _04interfaces.E9_8;

public class BasicAccount extends BankAccount{
    @Override
    public void withdraw(double amount){
        super.withdraw(amount);
        double balance = getBalance();
        if(balance < 0) {
            System.out.println("Withdraw denied!");
            deposit(amount);
        }
    }
}
