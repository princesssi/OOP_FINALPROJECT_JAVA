import java.util.ArrayList;

public class Menu {
    private ArrayList<FoodItem> foodItems;

    public Menu() {
        this.foodItems = new ArrayList<>();
    }

    public void addFoodItem(FoodItem item) {
        foodItems.add(item);
    }

    public ArrayList<FoodItem> getFoodItems() {
        return foodItems;
    }
}
