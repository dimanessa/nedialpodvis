import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.Scanner;

public class Main {
    private static final String DB_USERNAME = "postgres";
    private static final String DB_PASSWORD = "1111";
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";
    public static void main(String[] args) throws Exception {
        Worker Budko = new Worker("Oleksandr","manager",1);
        Worker Santo = new Worker("Roman","waiter",21);
        Budko.setEndTime(22);
        Budko.plusWorkHour();
        GUI app = new GUI();
        app.setVisible(true);
        Check check1 = new Check(3,"Roman",34);
        check1.changeOrderNumber(12);
        Order order1 = new Order(1,"Fish",55);
//        System.out.print(order1.discount(order1.getPrice()));
        Table table1 = new Table(1,"Oleksandr");
        table1.changeResponsible("Roman");

        Scanner scanner = new Scanner(System.in);
        Connection connection = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
        System.out.println("Input an food nazva:");
        String Nazva = scanner.next();
        System.out.println("Provide a number of price");
        String Price = scanner.next();
        System.out.println("Provide a number of kilkist");
        String Kilkist = scanner.next();

        InsertfoodToDB(Nazva, Price, Kilkist, connection);
    }
    private static void InsertfoodToDB(String Nazva, String Price, String Kilkist, Connection connection) throws Exception {
        String INSERT_SQL = "insert into food (Nazva, Price, Kilkist)" +
                "values (?,?,?);";
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_SQL);
        preparedStatement.setString(1,Nazva);
        preparedStatement.setString(2,Price);
        preparedStatement.setString(3,Kilkist);
        preparedStatement.executeUpdate();
    }

}