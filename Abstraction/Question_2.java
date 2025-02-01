abstract class Bank {
    abstract double calculateInterest();
}

class SavingsAccount extends Bank {
    private double balance;
    private double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return balance * interestRate / 100;
    }
}

class FixedDeposit extends Bank {
    private double principal;
    private double rate;
    private int time;

    public FixedDeposit(double principal, double rate, int time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    public double calculateInterest() {
        return (principal * rate * time) / 100;
    }
}

public class Question_2 {
    public static void main(String[] args) {
        Bank savings = new SavingsAccount(10000, 5);
        Bank fixedDeposit = new FixedDeposit(20000, 7, 3);

        System.out.println("Savings Account Interest: " + savings.calculateInterest());
        System.out.println("Fixed Deposit Interest: " + fixedDeposit.calculateInterest());
    }
}
