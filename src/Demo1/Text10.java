package Demo1;
import java.lang.Math;
class Point{
   public int a=1,b,c;
   public void Distance(int a,int b,int c){
       System.out.print(Math.sqrt(a*a+b*b+c*c));
   }

}
public class Text10 {
    public static void main(String[] args){
    Point P=new Point();
    P.Distance(1,2,3);
    }
}
