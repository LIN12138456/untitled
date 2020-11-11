package Demo1;
/*创建一个 Animal 抽象类，包括：成员变量 name（String），和一个抽象方法 shout()；
创建 Dog 类继承 Animal 类，并重写Animal 类中的抽象方法。在测试类中，实例化一个Dog
对象，并调用它的 shout()方法。*/
abstract class Animal{
    String name;
    abstract void shout();

}
class Dog extends Animal{
    void shout(){
        System.out.print("汪汪");
    }
}
public class Text06 {
    public static void main(String[] args) {
        Dog ha = new Dog();
        System.out.print("狗的名字是:");
        ha.name="la la la";
        System.out.println();
        System.out.println(ha.name);
        ha.shout();
    }
}