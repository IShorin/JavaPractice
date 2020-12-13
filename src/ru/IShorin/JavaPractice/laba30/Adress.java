package ru.IShorin.JavaPractice.laba30;

public final class Adress {
    private String cityName;
    private int zipCode;
    private  String streetName;
    private int buildingNumber;
    private char buidingLetter;
    private int apartmentNumber;
    public Adress EMPTY_ADRESS;

    public String getCityName() {
        return cityName;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public char getBuidingLetter() {
        return buidingLetter;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }
}
