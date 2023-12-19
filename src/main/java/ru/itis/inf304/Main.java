package ru.itis.inf304;

public class Main {
    public static void main(String[] args) {
        NextNumImpl numFactory = new NextNumImpl();
        Order[] orders = new Order[15];

        Customer Customerclient1 = new Customer("Игорь", Gender.male, Discount.student);
        Customer Customer2 = new Customer("Федор", Gender.male);
        Customer Customer3 = new Customer("Лилиана", Gender.female);

        Cooker cooker1 = new Cooker("Федор", Gender.male);
        Cooker cooker2 = new Cooker("Арсений", Gender.male);

        Order order1 = new Order(Customerclient1,cooker1, Pizza.Маргарита,
                OrderStatus.Заказан, numFactory.next(), "16.12.2023");
        for (int i = 0; i < orders.length; i++) {
            orders[i] = new Order (Customerclient1,cooker1, Pizza.Маргарита, OrderStatus.Заказан, numFactory.next(), "16.12.2023");
            System.out.println(orders[i]);
        }
    }
}