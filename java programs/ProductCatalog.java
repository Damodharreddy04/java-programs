import java.util.*;

class Product {
    int id;
    String name;

    Product(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class ProductCatalog {
    public static void main(String[] args) {
        TreeMap<Integer, Product> productCatalog = new TreeMap<>();
        productCatalog.put(1, new Product(1, "Laptop"));
        productCatalog.put(2, new Product(2, "Phone"));
        System.out.println("Products: " + productCatalog);
    }
}
