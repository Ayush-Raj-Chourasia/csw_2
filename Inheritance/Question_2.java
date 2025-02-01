class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        balance += balance * interestRate;
    }
}

class CheckingAccount extends BankAccount {
    double monthlyFee;

    CheckingAccount(double balance, double monthlyFee) {
        super(balance);
        this.monthlyFee = monthlyFee;
    }

    public void deductMonthlyFee() {
        balance -= monthlyFee;
    }
}

public class Question_2 {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(1000, 0.05);
        savings.calculateInterest();
        System.out.println("Savings Account Balance: " + savings.getBalance());

        CheckingAccount checking = new CheckingAccount(500, 10);
        checking.deductMonthlyFee();
        System.out.println("Checking Account Balance: " + checking.getBalance());
    }
}
