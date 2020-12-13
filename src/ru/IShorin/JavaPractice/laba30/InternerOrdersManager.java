package ru.IShorin.JavaPractice.laba30;

 class InternetOrdersManager implements OrdersManager {
    private QueueNode head;
    private QueueNode tail;
    private int size;

    public boolean add(Order order) {
        return false;
    }
    public Order remove() {
        return null;
    }
    public Order order() {
        return null;
    }

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