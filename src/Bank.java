import java.util.HashMap;

public class Bank {
    private HashMap<Integer, BankAccounte> accounts = new HashMap<>();
    private int accountCounter = 1001;

    public BankAccounte createAccount(String name, String password) {
        BankAccounte acc = new BankAccounte(accountCounter, name, password);
        accounts.put(accountCounter, acc);
        accountCounter++;
        return acc;
    }

    public BankAccounte login(int accNo, String password) {
        BankAccounte acc = accounts.get(accNo);
        if (acc != null && acc.checkPassword(password)) {
            return acc;
        }
        return null;
    }
}

