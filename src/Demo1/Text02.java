package Demo1;
//2、猜数字游戏：一个类 A 有一个成员变量 v，有一个初值 100。定义一个类，
//对 A 类的成员变量 v 进行猜。如果大了则提示大了，小了则提示小了。等于则
//提示猜测成功。
import java.util.Scanner;
class A{
    static int v=100;

}
public class Text02{
 public static void main(String[] args){
     Scanner in = new Scanner(System.in);
     int a;
     System.out.println("请输入一个数");
     while(true){
     a=in.nextInt();
     if(a==A.v){
     System.out.print("猜对了");
     break;}
     else if(a>A.v)
         System.out.print("大了");
     else
         System.out.print("小了");
     }
 }
}
