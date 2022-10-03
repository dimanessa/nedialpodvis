import java.util.Random;
import java.util.Arrays;
public class Order {
    private int dishNumber;
    private String dishName;
    private int price;
    int[][] array = new int [10][10];

    public void array()  {
        Random random = new Random();
        for(int i=0;i<=9;i++)
        {
            for(int j=0;j<=9;j++)
            {
                array[i][j]= random.nextInt()/100000;
            }
        }

    for(int i=0;i<=9;i++)
    {
        for(int j=0;j<=9;j++)
        {
            System.out.print(array[i][j]+",");
        }
        System.out.println();
    }
        System.out.println("Modified arr[] : " + Arrays.toString(array));
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
