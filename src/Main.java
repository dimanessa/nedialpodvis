public class Main {
    public static void main(String[] args) {
        Worker Budko = new Worker("Oleksandr","manager",1);
        Worker Santo = new Worker("Roman","waiter",21);
        Budko.setEndTime(22);
        Budko.plusWorkHour();
        System.out.print(Budko.getEndTime());
        Check first = new Check(3,"Roman",34);
    }


}