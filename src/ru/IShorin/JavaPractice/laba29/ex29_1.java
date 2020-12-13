package ru.IShorin.JavaPractice.laba29;
import java.util.HashMap;
import java.util.NoSuchElementException;

final class Dish {
    private String description;
    public Dish(String description){
        try {
            this.description = description;
        } catch (IllegalArgumentException e) {
            if (description==null) {
                System.out.println(e);
            }
        }
    }
}
////////////////////////////////////////////////////////////////////////////
 final class Drink implements Item {
    private int cost;
    private String name;
    private Dish description;
    public Drink(int cost, String name, Dish description)  {
        try{
            this.cost = cost;
            this.name = name;
            this.description = description;
        } catch (IllegalArgumentException e) {
            if ((cost==0)||(name==null)||(description==null)) {
                System.out.println(e);
            }
        }
    }
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Dish getDescription() {
        return description;
    }

    @Override
    public void setDescription(Dish description) {
        this.description = description;
    }
}
/////////////////////////////////////////////////////////////////////////
 class InternetOrder<I> {
    I data;
    InternetOrder<I> next;
    InternetOrder<I> prev;
    InternetOrder(I data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
    InternetOrder(InternetOrder<I> prev, I data, InternetOrder<I> next) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}
///////////////////////////////////////////////////////////////////////
 interface Item{
    int getCost();
    void setCost(int cost);
    String getName();
    void setName(String name);
    Dish getDescription();
    void setDescription(Dish description);
}
///////////////////////////////////////////////////////////////////////
 interface Order {
    int remove(Item x);
    int remove(Item x, HashMap<String, Order> hashMap);
    int size();
    boolean addFront(Item x);
    boolean addFront(Item x, HashMap<String, Order> hashMap);
    boolean addFront(HashMap<String, Order> hashMap);
    Item getOrders(HashMap<String, Order> hashMap);
    Item massOrders();
    Item massOrdersSorted();
    int cost();
    int quantityporshions(String name);
    int quantity(Item x); //
    Item massOrdersnames();
}
///////////////////////////////////////////////////////////////////////
 class OrderAlreadyAddedException extends Exception {
    private InternetOrder<Item> front;
    private int size;
    public boolean isEmpty() {
        return size == 0;
    }
    public void addAfter(Item x, Item y) {

    }

    public OrderAlreadyAddedException(InternetOrder<Item> front, int size) {
        this.front = front;
        this.size = size;
    }

    public OrderAlreadyAddedException(String message, InternetOrder<Item> front, int size) {
        super(message);
        this.front = front;
        this.size = size;
    }

    public OrderAlreadyAddedException(String message, Throwable cause, InternetOrder<Item> front, int size) {
        super(message, cause);
        this.front = front;
        this.size = size;
    }

    public OrderAlreadyAddedException(Throwable cause, InternetOrder<Item> front, int size) {
        super(cause);
        this.front = front;
        this.size = size;
    }

    public OrderAlreadyAddedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, InternetOrder<Item> front, int size) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.front = front;
        this.size = size;
    }
}
/////////////////////////////////////////////////////////////////////////////
 class OrderManager<Item> {
    private InternetOrder<Item> front;
    private int size;
    HashMap<String, Order> hashtable = new HashMap<String, Order>();

    public OrderManager() {
        front = null;
    }
    public boolean addFront(HashMap<String, Order> hashtable) {
        if (isEmpty()) {
            front = new InternetOrder<Item>((Item) hashtable.values());
            size++;
            return false;
        }
        else {
            InternetOrder<Item> temp = front;
            front = new InternetOrder<Item>(null, (Item) hashtable.values(), temp);
            front.next.prev = front;
            size++;
            return true;
        }
    }
    public void addEnd(Item x) {
        if (isEmpty())
            front = new InternetOrder<Item>(x);
        else {
            InternetOrder<Item> temp = front;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new InternetOrder<Item>(temp, x, null);
        }
        size++;
    }
    public void addBefore(Item x, Item y) {
        if (isEmpty())
            throw new NoSuchElementException("Element " + x.toString() + " not found");
        InternetOrder<Item> current = front;
        while (current != null && !current.data.equals(x))
            current = current.next;
        if (current == null)
            throw new NoSuchElementException("Element " + x.toString() + " not found");
        InternetOrder<Item> newNode = new InternetOrder<Item>(current.prev, y, current);
        if (current.prev != null)
            current.prev.next = newNode;
        else
            front = newNode;
        current.prev = newNode;

        size++;
    }

    public void addAfter(Item x, Item y) {
        if (isEmpty())
            throw new NoSuchElementException("Element " + x.toString() + " not found");
        InternetOrder<Item> current = front;
        while (current != null && !current.data.equals(x))
            current = current.next;
        if (current == null)
            throw new NoSuchElementException("Element " + x.toString() + " not found");
        InternetOrder<Item> newNode = new InternetOrder<Item>(current, y, current.next);
        if (current.next != null)
            current.next.prev = newNode;
        current.next = newNode;
        size++;
    }
    public void remove(Item x) {
        if (isEmpty())
            throw new NoSuchElementException("Element " + x.toString() + " not found");
        if (front.data.equals(x)) {
            front = front.next;
            return;
        }

        InternetOrder<Item> current = front;
        while (current != null && !current.data.equals(x))
            current = current.next;
        if (current == null)
            throw new NoSuchElementException("Element " + x.toString() + " not found");
        if (current.next != null)
            current.next.prev = current.prev;

        current.prev.next = current.next;

        size--;
    }

    public boolean isEmpty() {
        return size == 0;
    }


    @Override
    public String toString() {
        InternetOrder<Item> temp = front;
        StringBuilder builder = new StringBuilder("[");

        while (temp != null) {
            builder.append(temp.data).append(",");
            temp = temp.next;
        }
        builder.deleteCharAt(builder.length() - 1);
        builder.append("]");
        return builder.toString();
    }
}
/////////////////////////////////////////////////////////////////////////////
abstract class RestaurantOrder <Item> implements Order {

    private InternetOrder<Item> front;
    private int size;
    public RestaurantOrder() {
        front = null;
    }
    public void addFront(Item x) {
        if (isEmpty())
            front = new InternetOrder<Item>(x);
        else {
            InternetOrder<Item> temp = front;
            front = new InternetOrder<Item>(null, x, temp);
            front.next.prev = front;
        }
        size++;
    }
    public void addEnd(Item x) {
        if (isEmpty())
            front = new InternetOrder<Item>(x);
        else {
            InternetOrder<Item> temp = front;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new InternetOrder<Item>(temp, x, null);
        }
        size++;
    }
    public void addBefore(Item x, Item y) {
        if (isEmpty())
            throw new NoSuchElementException("Element " + x.toString() + " not found");
        InternetOrder<Item> current = front;
        while (current != null && !current.data.equals(x))
            current = current.next;
        if (current == null)
            throw new NoSuchElementException("Element " + x.toString() + " not found");

        InternetOrder<Item> newNode = new InternetOrder<Item>(current.prev, y, current);
        if (current.prev != null)
            current.prev.next = newNode;
        else
            front = newNode;
        current.prev = newNode;

        size++;
    }

    public void addAfter(Item x, Item y) {
        if (isEmpty())
            throw new NoSuchElementException("Element " + x.toString() + " not found");

        InternetOrder<Item> current = front;

        while (current != null && !current.data.equals(x))
            current = current.next;

        if (current == null)
            throw new NoSuchElementException("Element " + x.toString() + " not found");

        InternetOrder<Item> newNode = new InternetOrder<Item>(current, y, current.next);
        if (current.next != null)
            current.next.prev = newNode;
        current.next = newNode;

        size++;
    }
    public void remove(Item x) {
        if (isEmpty())
            throw new NoSuchElementException("Element " + x.toString() + " not found");
        if (front.data.equals(x)) {
            front = front.next;
            return;
        }

        InternetOrder<Item> current = front;
        while (current != null && !current.data.equals(x))
            current = current.next;
        if (current == null)
            throw new NoSuchElementException("Element " + x.toString() + " not found");
        if (current.next != null)
            current.next.prev = current.prev;

        current.prev.next = current.next;

        size--;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean addFront(ru.IShorin.JavaPractice.laba29.Item x) {
        return false;
    }

    @Override
    public boolean addFront(ru.IShorin.JavaPractice.laba29.Item x, HashMap<String, Order> hashMap) {
        return false;
    }

    @Override
    public boolean addFront(HashMap<String, Order> hashMap) {
        return false;
    }

    @Override
    public int remove(ru.IShorin.JavaPractice.laba29.Item x) {
        return 0;
    }

    @Override
    public int remove(ru.IShorin.JavaPractice.laba29.Item x, HashMap<String, Order> hashMap) {
        return 0;
    }

    public int size() {
        return size;
    }

    @Override
    public ru.IShorin.JavaPractice.laba29.Item getOrders(HashMap<String, Order> hashMap) {
        return null;
    }

    @Override
    public ru.IShorin.JavaPractice.laba29.Item massOrders() {
        return null;
    }

    @Override
    public ru.IShorin.JavaPractice.laba29.Item massOrdersSorted() {
        return null;
    }

    @Override
    public int cost() {
        return 0;
    }

    @Override
    public int quantityporshions(String name) {
        return 0;
    }

    @Override
    public int quantity(ru.IShorin.JavaPractice.laba29.Item x) {
        return 0;
    }

    @Override
    public ru.IShorin.JavaPractice.laba29.Item massOrdersnames() {
        return null;
    }

    @Override
    public String toString() {
        InternetOrder<Item> temp = front;
        StringBuilder builder = new StringBuilder("[");

        while (temp != null) {
            builder.append(temp.data).append(",");
            temp = temp.next;
        }
        builder.deleteCharAt(builder.length() - 1);
        builder.append("]");
        return builder.toString();
    }
}