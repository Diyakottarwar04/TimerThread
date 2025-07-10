// Abstract parent class representing a generic bank account
abstract class Account {
    protected double balance;

    // Constructor to initialize balance
    public Account(double balance) {
        this.balance = balance;
    }

    // Abstract method to be implemented by all account types
    public abstract double calculateInterest();
}

// Subclass for savings account
class SavingAccount extends Account {

    public SavingAccount(double balance) {
        super(balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.04; // 4% interest
    }
}

// Subclass for current account
class CurrentAccount extends Account {

    public CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.02; // 2% interest
    }
}

// Main driver class 
public class BankDemo {
    public static void main(String[] args) {
        double amount = 10000.0;

        // Polymorphism: parent reference to child objects
        Account acc1 = new SavingAccount(amount);
        Account acc2 = new CurrentAccount(amount);

        // Calculate interest
        double interest1 = acc1.calculateInterest();
        double interest2 = acc2.calculateInterest();

        System.out.println("Saving Account interest on " + amount + ": " + interest1);
        System.out.println("Current Account interest on " + amount + ": " + interest2);
    }
}
