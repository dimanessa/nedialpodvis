public class Check  {
    private int tableNumber;
    private String responsible;
    private int orderNumber;
    public Check(int number, String responsible, int orderNumber) {
        this.tableNumber=number;
        this.orderNumber=orderNumber;
        this.responsible=responsible;
    }

    public void changeOrderNumber(int ordernumber){
        this.orderNumber=ordernumber;
    }
}
