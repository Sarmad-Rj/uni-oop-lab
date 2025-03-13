package Assignment_1;

import java.util.List;
import java.util.ArrayList;

public class Purchase {
    public List<Product> products = new ArrayList<>();

    public void addProduct(Product product) { products.add(product); }
    public List<Product> getProducts() { return products; }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}