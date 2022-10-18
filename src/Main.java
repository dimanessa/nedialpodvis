import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Worker Budko = new Worker("Oleksandr","manager",1);
        Worker Santo = new Worker("Roman","waiter",21);
        Budko.setEndTime(22);
        Budko.plusWorkHour();

        Check check1 = new Check(3,"Roman",34);
        check1.changeOrderNumber(12);
        Order order1 = new Order(1,"Fish",55);
//        System.out.print(order1.discount(order1.getPrice()));
        Table table1 = new Table(1,"Oleksandr");
        table1.changeResponsible("Roman");
        order1.AddCollection();
        order1.FileWriter();
        order1.FileReader();

    }


}