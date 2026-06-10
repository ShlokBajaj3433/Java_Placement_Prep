package Projects.Bank;

public class App {
    
    public static void main(String[] args) {
        BOI corporateAccount = new BOI("Shlok", "BOIIN12345678COR", 1000.0);
        BOI businessAccount = new BOI("Rohit", "BOIIN654321432BUS", 2000.0);
        BOI savingsAccount = new BOI("Aman", "9876543210", 500.0);

        corporateAccount.Deposit(500.0);
        corporateAccount.Withdraw(200.0);

        corporateAccount.ShowDetails();
        businessAccount.ShowDetails();
        savingsAccount.ShowDetails();
        BOI.BankMaiChori();
    }
}
