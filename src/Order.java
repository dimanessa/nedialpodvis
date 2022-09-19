public class Order {
    private int dishNumber;
    private String dishName;
    private int price;

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
