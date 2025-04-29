import java.util.Scanner;

public class ProductComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter price of product A:");
        double priceA = scanner.nextDouble();
        System.out.println("Enter price of product B:");
        double priceB = scanner.nextDouble();
        if (priceA < priceB) {
            System.out.println("Product A is cheaper.");
        } else if (priceA > priceB) {
            System.out.println("Product B is cheaper.");
        } else {
            System.out.println("Both products have the same price.");
        }
    }
}