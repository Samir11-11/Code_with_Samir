class Q14{
    String accountNumber;
    double balance;
    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void deposit(double amount) {
        balance += amount;
    }
    void withdraw(double amount) {}
}
class SavingsAccount extends BankAccount {
    SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount >= 500) balance -= amount;
    }
}
class CurrentAccount extends BankAccount {
    CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
    @Override
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            if (balance < 1000) balance -= 50;
        }
    }
}
public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA001", 1500);
        CurrentAccount current = new CurrentAccount("CA001", 3000);
        savings.deposit(500);
        savings.withdraw(1000);

        current.deposit(1000);
        current.withdraw(3500);
    }
}
