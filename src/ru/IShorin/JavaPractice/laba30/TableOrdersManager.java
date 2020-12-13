package ru.IShorin.JavaPractice.laba30;

public class TableOrdersManager implements OrdersManager {
    private Order[] orders;

    public void add(Order order, int tableNumber) { }
    public void addItem(MenuItem item, int tableNumber) { }

    @Override
    public int itemsQuantity(String itemName) {
        return 0;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        return 0;
    }

    @Override
    public Order[] getOrders() {
        return new Order[0];
    }

    @Override
    public int ordersCostSummary() {
        return 0;
    }

    @Override
    public int ordersQuantity() {
        return 0;
    }
}
