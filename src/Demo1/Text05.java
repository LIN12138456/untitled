package Demo1;

/*4.创建一个类，为该类定义三个构造函数，分别执行下列操作： 1、传递两个
        整数值并找出其中较大的一个值；2、传递三个 double 值并求出其乘积； 3、
        传递两个字符串值并检查其是否相同； 4、在 main 方法中测试构造函数的调用。*/
class Ai{
    int a,b;
    double c,d,q;
    String e,f;
    int max;
    double m;
    public Ai(int a,int b){
    if(a>b)
        max=a;
    else
        max=b;
    }
    public Ai(double c,double d,double q){
        m=c*d*q;
    }
    public Ai(String e,String f){
       if(e.equals(f))
           System.out.println("相等");

    }

}
public class Text05 {
    public static void main(String[] args){
        Ai l=new Ai(28.0,9.0,19.0);
        Ai g=new Ai(2,3);
        Ai k=new Ai("林阳","林阳");
        System.out.println(l.m);
        System.out.print(g.max);
    }
}
