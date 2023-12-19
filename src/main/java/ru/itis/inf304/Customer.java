package ru.itis.inf304;

public class Customer extends Human{
    private Discount discount;
    Customer(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }
    Customer (String name, Gender gender, Discount discount) {
        this.name = name;
        this.gender = gender;
        this.discount = discount;
    }

}
