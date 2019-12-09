package _04interfaces.E9_8;

public class driver
{
    public static void main(String[] args) {
        BasicAccount acc = new BasicAccount();
        System.out.println("Current balance: "+acc.getBalance());
        acc.deposit(10); // deposit 10 dollar
        System.out.println("Current balance: "+acc.getBalance());
        acc.withdraw(5); // withdraw 10 dollar
        System.out.println("Current balance: "+acc.getBalance());
        acc.withdraw(10); // withdraw 5 dollar
        System.out.println("Current balance: "+acc.getBalance());
    }
}
