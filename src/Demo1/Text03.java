package Demo1;
/*3.编写 Java 程序，用于显示人的姓名和年龄。 定义一个人类（Person），该类中
        应该有两个私有属性，姓名（name）和年龄（age）。定义构造方法，用来初始化
        数据成员。再定义显示（display）方法，将姓名和年龄打印出来。 在 main 方法
        中创建人类的实例，然后将信息显示。*/
class Person{
      String name="linyang";
    private  int age=1;
      Person(String name,int age){
       this.name=name;
       this.age=age;
    }
    public void Printinfo(){
       System.out.print("姓名是："+name+"年龄是"+age);

    }
        }
public class Text03 {
    public static void main(String[] args){
        Person p=new Person("linyang",18);
         p.Printinfo();

    }

}
