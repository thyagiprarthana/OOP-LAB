interface BankOperations {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

class BankAccount implements BankOperations {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class BankApp {
    public static void main(String[] args) {
        BankOperations account = new BankAccount();

        account.deposit(1000);
        account.withdraw(300);
        account.withdraw(800); 
        System.out.println("Current Balance: $" + account.getBalance());
    }
}
