import java.util.ArrayList;

public class Order {
    private Customer customer;
    private ArrayList<FoodItem> foodItems;
    private double totalPrice;

    public Order(Customer customer) {
        this.customer = customer;
        this.foodItems = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    public void addFoodItem(FoodItem item) {
        foodItems.add(item);
        totalPrice += item.getPrice();
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public ArrayList<FoodItem> getFoodItems() {
        return foodItems;
    }
}
