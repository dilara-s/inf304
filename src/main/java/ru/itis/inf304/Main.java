package ru.itis.inf304;

public class Main {
    public static void main(String[] args) throws CookerException{
        NextNumImpl numFactory = new NextNumImpl();
        Order[] orders = new Order[15];

        Customer Customer1 = new Customer("Игорь", Gender.male, Discount.student);
        Customer Customer2 = new Customer("Федор", Gender.male);
        Customer Customer3 = new Customer("Лилиана", Gender.female);

        Cooker cooker1 = new Cooker("Петя", Gender.male);
        Cooker cooker2 = new Cooker("Арсений", Gender.male);

        Order order1 = new Order(Customer1,cooker1, Pizza.Маргарита,
                OrderStatus.Заказан, numFactory.next(), "16.12.2023");
        System.out.println(order1.toString());
        Order order2 = new Order (Customer2, cooker2, Pizza.ЧетыреСыра, OrderStatus.Выдан, numFactory.next(), "15.12.23");
        System.out.println( );
        if (cooker1.name != "Федор"){
            throw new CookerException("Введено не то имя");
        }
    }
}