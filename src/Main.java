import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {
            System.out.println("\n===== BANKING SYSTEM =====");
            System.out.println("1. Create Account");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Set Password: ");
                    String pwd = sc.nextLine();

                    BankAccounte acc = bank.createAccount(name, pwd);
                    System.out.println("Account created successfully!");
                    System.out.println("Your Account Number: " + acc.getAccountNumber());
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    int accNo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Password: ");
                    String pass = sc.nextLine();

                    BankAccounte user = bank.login(accNo, pass);
                    if (user == null) {
                        System.out.println("Invalid login!");
                        break;
                    }

                    while (true) {
                        System.out.println("\n1. Deposit");
                        System.out.println("2. Withdraw");
                        System.out.println("3. Check Balance");
                        System.out.println("4. Transaction History");
                        System.out.println("5. Logout");
                        System.out.print("Choose option: ");

                        int opt = sc.nextInt();

                        if (opt == 5) break;

                        switch (opt) {
                            case 1:
                                System.out.print("Enter amount: ");
                                user.deposit(sc.nextDouble());
                                System.out.println("Deposit successful");
                                break;

                            case 2:
                                System.out.print("Enter amount: ");
                                double amt = sc.nextDouble();
                                if (user.withdraw(amt))
                                    System.out.println("Withdrawal successful");
                                else
                                    System.out.println("Insufficient balance");
                                break;

                            case 3:
                                System.out.println("Balance: ₹" + user.getBalance());
                                break;

                            case 4:
                                user.showTransactions();
                                break;
                        }
                    }
                    break;

                case 3:
                    System.out.println("Thank you for using Banking System!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

