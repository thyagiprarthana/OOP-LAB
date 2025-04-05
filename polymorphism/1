class BankAccount {
    String accountHolder;

    public BankAccount(String name) {
        this.accountHolder = name;
        System.out.println(name + "'s bank account created.");
    }

     public void showAccountType() {
        System.out.println("Generic Bank Account.");
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String name) {
        super(name); // Call parent constructor
    }

      public void showAccountType() {
        System.out.println(accountHolder + " has a Savings Account.");
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String name) {
        super(name); // Call parent constructor
    }

        public void showAccountType() {
        System.out.println(accountHolder + " has a Current Account.");
    }
}


public class BankSystem {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("Alice"); // Savings Account object
        acc1.showAccountType();

        BankAccount acc2 = new CurrentAccount("Bob"); // Current Account object
        acc2.showAccountType();
    }
}
