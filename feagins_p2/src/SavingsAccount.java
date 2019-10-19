//import java.util.Scanner;
//import java.text.DecimalFormat;

public class SavingsAccount {
    static private double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public void calculateMonthlyInterest() {
        double monInterest;
        monInterest = this.savingsBalance * annualInterestRate / 12;
        this.savingsBalance += monInterest;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public static void modifyInterestRate(double newIR) {
        annualInterestRate = newIR;
    }
    public static void main(String[] args) {
    }
}

