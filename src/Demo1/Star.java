package Demo1;
/*4、通过键盘输入一个数控制输出星的行数，例如输入4则打印以下图形
        *
        ***
        *****
        ****** */
import java.util.Scanner;
public class Star {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个数");
        int a= in.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1; j<=(a-i);j++){
            System.out.print(" ");}
            for(int k=1;k<=((i*2)-1);k++){
                System.out.print("*");}
            System.out.println();}

        }


    }

