package Demo1;

import java.util.Scanner;

/*8.定义一个 Compare 类，在其中以重载的方式定义两个静态方法（同名），分别
        实现求两个整数和三个整数中的最大数，并输出。*/
class Compare {

    static void compare(int a, int b, int c) {
        if (a < b)
            a = b;
        if (a < c)
            a = c;
        System.out.print(a);
    }

    static void compare(int b, int c) {
        if (c > b)
            b = c;
        System.out.print(b);
    }
}
public class Text09 {
        public static void main(String[] args){
            Scanner in=new Scanner(System.in);
            System.out.println("请输入三个数");
            int a=in.nextInt();
            int b=in.nextInt();
            int c=in.nextInt();
            System.out.print("三个数中最大的是：");
        Compare.compare(a,b,c);
            System.out.print("两个数中最大的是：");
        Compare.compare(b,c);
}
}
