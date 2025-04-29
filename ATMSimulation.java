class ATMSimulation {
    public static void main(String[] args) {
        int balance = 5000;
        try {
            try {
                int amount = 7000;
                if (amount > balance) {
                    throw new ArithmeticException("Insufficient balance");
                }
            } catch (ArithmeticException e) {
                System.out.println("Inner Catch: " + e.getMessage());
                throw new Exception("ATM transaction failed");
            }
        } catch (Exception e) {
            System.out.println("Outer Catch: " + e.getMessage());
        }
    }
}