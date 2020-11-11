package Demo1;
/*编写程序计算圆的面积和周长。要求：定义一个 Area_Peri 抽象类，有两个抽
象成员方法 getArea()和 getPerimeter()，分别表示“计算面积”和“计算周长”；
再定义一个 Circle 类，继承 Area_Peri，实现相应的抽象方法。*/
abstract class Area_Peri{
   float area;
   public abstract void getArea();

}
class Circle extends Area_Peri{
    double area;
    public void gerArea(int r){
        area=3.14*r*r;
       System.out.print("圆的面积是"+area);
    }

    @Override
    public void getArea() {

    }
}
public class Text11 {
    public static void main(String[] args){
        Circle c=new Circle();
        c.gerArea(3);

    }
}
