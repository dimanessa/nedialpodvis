public class Table {
    private int tableNumber;
    private String responsible; //відповідальний
    public Table(int number,String responsible){

        this.tableNumber=number;
        this.responsible=responsible;
    }


    public void changeResponsible(String name){
        this.responsible=name;
    }
}
