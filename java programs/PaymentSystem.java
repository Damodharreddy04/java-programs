public class PaymentSystem {
    public void pay(int amount) {
        System.out.println("Paid using cash: " + amount);
    }

    public void pay(String cardNumber, int amount) {
        System.out.println("Paid using card (" + cardNumber + "): " + amount);
    }

    public static void main(String[] args) {
        PaymentSystem payment = new PaymentSystem();
        payment.pay(5000);
        payment.pay("1234-5678-9876-5432", 15000);
    }
}
