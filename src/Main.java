public class Main {
    public static void main(String[] args) {
        Worker Budko = new Worker("Oleksandr","manager",1);
        Worker Santo = new Worker("Roman","waiter",21);
        Budko.setEndTime(22);
        Budko.plusWorkHour();

        Check check1 = new Check(3,"Roman",34);

        Order order1 = new Order(1,"Fish",55);
        System.out.print(order1.discount(order1.getPrice()));
        Table table1 = new Table(1,"Oleksandr");
    }


}