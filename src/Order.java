import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    private int dishNumber;
    private String dishName;
    private int price;
    ArrayList<Object> objects = new ArrayList<Object>();
    Scanner sc = new Scanner(System.in);
    File file = new File("1.txt");
    public void AddCollection(){
        objects.add(sc.next());
    }
    public void FileWriter() throws IOException {

        FileWriter writer = new FileWriter(file.getAbsolutePath(), true);
        writer.write("\n"+(String) objects.get((objects.size()-1)));

        writer.close();
    }
    public void FileReader() throws IOException {

        FileReader reader = new FileReader(file.getAbsolutePath());
        BufferedReader bufferedReader = new BufferedReader(reader);
        String fileStrings;
        while ((fileStrings=bufferedReader.readLine())!=null) {
            objects.add(fileStrings);
            System.out.println(objects.get((objects.size()-1)));
        }
        System.out.println(objects.size());

    }
    public Order(int dishNumber, String dishName, int price) {
        this.dishNumber=dishNumber;
        this.dishName=dishName;
        this.price=price;
    }

    public int getPrice() {
        return price;
    }
    public double discount(int price)
    {
        return price*=0.7;
    }
}
