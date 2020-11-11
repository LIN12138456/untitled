package Demo1;
interface Vehicle {
    void start(int i);

    void stop(int j);

}
class Bus implements Vehicle{
     public void start(int x){
         System.out.print("启动时间"+x);
     }
     public void stop(int y){
         System.out.print("停车时间"+y);
     }
}
class Bike implements Vehicle{
    public void start(int x){
        System.out.print("启动时间"+x);
    }
    public void stop(int y){
        System.out.print("停车时间"+y);
    }
}


public class DemoInterface {
    public static void main(String[] args){
        Bus a = new Bus();
        Bike b= new Bike();
        a.start(2);
        a.stop(3);
        b.start(4);
        b.stop(5);
    }
}
