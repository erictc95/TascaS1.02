package exercise1;

import exceptions.EmptySaleException;

import java.util.ArrayList;
import java.util.List;

public class Sale {
    private List<Product> products = new ArrayList<>();
    private double totalPrice = 0.0;


    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void calculateTotal() {
        if (products.isEmpty()) {
            throw new EmptySaleException();
        }
        totalPrice = 0.0;
        for (Product product:products) {
            totalPrice += product.getPrice();
        }
    }
}
