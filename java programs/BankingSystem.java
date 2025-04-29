class Account {
    public Account() {
        this("Savings Account");
        System.out.println("Default Account Created.");
    }

    public Account(String type) {
        System.out.println(type + " Created.");
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Account account = new Account();
    }
}