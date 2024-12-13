class Order {
    private Map<Orderable, Integer> items = new HashMap<>();

    // Getter method to access items
    public Map<Orderable, Integer> getItems() {
        return items;
    }

    public void addItemToCart(Orderable item, int quantity) {
        items.put(item, items.getOrDefault(item, 0) + quantity);
    }

    public double calculateTotal() {
        double total = 0;
        for (Map.Entry<Orderable, Integer> entry : items.entrySet()) {
            total += entry.getKey().getPrice() * entry.getValue();
        }
        return total;
    }
