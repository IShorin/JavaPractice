package ru.IShorin.JavaPractice.laba30;

public interface Al {
    boolean isAlcoholicDrink();
    double getAlcoholVol();
}
 final class Customer {
    private String firstName;
    private String secondName;
    private int age;
    private Adress address;
    private Customer MATURE_UNKNOWN_CUSTOMER;
    private Customer NOT_MATURE_UNKNOWN_CUSTOMER;

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public Adress getAdress() {
        return address;
    }
}
 final class Dish extends MenuItem {
    public Dish(int cost, String name, String description) {
        super(cost, name, description);
    }
}
class Drink extends MenuItem implements Al {
    private double alcoholVol;
    private DrinkTypeEnum type;

    public Drink(int cost, String name, String description, double alcoholVol, DrinkTypeEnum type) {
        super(cost, name, description);
        this.alcoholVol = alcoholVol;
        this.type = type;
    }

    public DrinkTypeEnum getType() {
        return type;
    }

    @Override
    public boolean isAlcoholicDrink() {
        return false;
    }

    @Override
    public double getAlcoholVol() {
        return 0;
    }
}
 enum DrinkTypeEnum {
     BEER,
     WINE,
     VODKA,
     CHAMPAGNE
}
