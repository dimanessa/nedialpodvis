public class Worker {
     private String name;
     private String specialty;
     private int endTime;

     public Worker(String name, String specialty, int endTime) {
          this.name=name;
          this.specialty=specialty;
          this.endTime=endTime;
     }

     public int getEndTime() {
          return endTime;
     }

     public void setEndTime(int Time){
          if(Time>23 || Time<0) {
               System.out.println("Value is not correct");
          }
          else {
               this.endTime=Time;
          }
     }

     public void plusWorkHour(){
          endTime++;
          if(endTime==24) endTime=0;
     }
}
