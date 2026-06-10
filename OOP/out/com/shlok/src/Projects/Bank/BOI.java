package Projects.Bank;

public class BOI {
    static final String DEFAULT_ACCOUNT_NO = "BOIIN1111";

    private String name;
    private String AccountNo;
    private double balance;

    BOI() {
        name = null;
        AccountNo = DEFAULT_ACCOUNT_NO;
        balance = 0.0;
    }

    BOI(String name, String AccountNo, double balance) {
        this.name = name;
        this.AccountNo = AccountNo;
        this.balance = balance;
    }

    void Deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    void Withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    double CurrentBalance() {
        return balance;
    }

    String CheckAccount() {
        String accountNoUpper = AccountNo.toUpperCase();

        if (accountNoUpper.endsWith("COR")) {
            return "Corporate Account";
        }

        if (accountNoUpper.endsWith("BUS")) {
            return "Business Account";
        }

        if (AccountNo.matches("[0-9]+")) {
            return "Savings Account";
        }

        return "Invalid Account";
    }

    void ShowDetails() {
        System.out.println("Name: " + name);
        System.out.println("Account No: " + AccountNo);
           System.out.println("Account Type: " + CheckAccount());
        System.out.println("Balance: " + balance);
    }

    static void BankMaiChori() {
        System.out.println("Bank mai chori nahi karni chahiye.");
    }
}
