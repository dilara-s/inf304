package ru.itis.inf304;

public class Order {
    private Customer customer;
    private Cooker cooker;
    private Pizza pizza;
    private OrderStatus orderStatus;
    private Integer orderNumber;
    private String date;

    public Order(Customer customer, Cooker cooker, Pizza pizza, OrderStatus orderStatus, Integer orderNumber, String date) {
        this.customer = customer;
        this.cooker = cooker;
        this.pizza = pizza;
        this.orderStatus = orderStatus;
        this.orderNumber = orderNumber;
        this.date = date;
    }

    @Override
    public String toString() {
        return "customer=" + customer.name + ", cooker=" + cooker.name + ", pizza=" + pizza + ", orderStatus=" + orderStatus + ", orderNumber=" + orderNumber + ", date='" + date + "'";
    }
}
