import java.util.ArrayList;

public class BankAccount {
    private int accountNumber;
    private String name;
    private String password;
    private double balance;
    private ArrayList<String> transactions;

    public BankAccount(int accountNumber, String name, String password) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.password = password;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
        transactions.add("Account created with balance 0");
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public boolean checkPassword(String pwd) {
        return password.equals(pwd);
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add("Deposited: ₹" + amount);
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            transactions.add("Withdrawn: ₹" + amount);
            return true;
        }
        return false;
    }

    public void showTransactions() {
        System.out.println("\nTransaction History:");
        for (String t : transactions) {
            System.out.println(t);
        }
    }
}

