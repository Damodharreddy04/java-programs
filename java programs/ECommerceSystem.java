class ECommerceSystem {
    public static void main(String[] args) {
        String[] products = {"Laptop", "Phone"};
        
        try {
            System.out.println(products[5]);
            int price = Integer.parseInt("abc");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}