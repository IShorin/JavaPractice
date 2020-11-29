package ru.IShorin.JavaPractice.laba24;

import java.util.Scanner;

class Address {
    private String country, region, city, street, house, building, apartment;
    private String address;

    public Address(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", building='" + building + '\'' +
                ", apartment='" + apartment + '\'' +
                '}';
    }
    public void addressHandler(){
        try {
            String[] tmp = address.split(", ");
            tmp[0] = tmp[0].trim();
            country = tmp[0];
            region = tmp[1];
            city = tmp[2];
            street = tmp[3];
            house = tmp[4];
            building = tmp[5];
            tmp[6] = tmp[6].trim();
            apartment = tmp[6];
        }
        catch(Exception e){
            System.out.println("Error(1)");
        }
    }
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        Address address = new Address(scanner.nextLine());
        address.addressHandler();
        System.out.println(address.toString());
    }
}
