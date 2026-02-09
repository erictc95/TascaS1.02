import java.util.ArrayList;

public class Sale {
    private ArrayList<Product> products = new ArrayList<>();
    private double totalPrice;

    public Sale() {
        this.totalPrice = totalPrice;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void calculateTotal() throws EmptySaleException {
        if (products.isEmpty()) {
            throw new EmptySaleException();
        }
        totalPrice = 0.0;
        for (int i = 0; i < products.size(); i++) {
            totalPrice += products.get(i).getPrice();
        }
    }
}
