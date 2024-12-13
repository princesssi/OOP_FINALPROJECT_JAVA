public class RestaurantGUI {
    private static final Map<String, Customer> registeredCustomers = new HashMap<>();
    private static double totalDonations = 0;
    private static Map<String, Orderable> menu = initializeMenu();
    private static Customer currentCustomer = null;
    private static Order currentOrder = null;
