package Java3;

/**
 * @author WeiLiang
 * @date 2021/6/17 - 14:15
 */
/*
*
* 1.Java中允许将一个类A声明在另一个类B中，则类A是内部类，类B为外部类
* 2.内部类的分类，成员内部类(静态的、非静态的) vs 局部内部类(方法内，代码块内，构造期内)
*3.成员内部类:
*       一方面，作为外部类的成员
*           >调用外部类的结构
*           >可以被static修饰
*           >被四种不同的权限修饰
*       另一方面,作为一个类;
*               >类内可以定义属性，方法，构造器
*               >可以被final修饰，表示此类不能被继承
*                 言外之意，不能使用final，就可以被继承
*               >可以abstract修饰
* 4.关注如下三个问题
*   4.1如何实例化成员内部类的对象
*       静态
*   A.a aa=new A.a();
*   非静态
*   A d=new A();
*       A.a a=d.new a();
*   4.2如何在成员内部类中区分调用外部类的结构
*   4.3开发中局部内部的使用
* */
public class InnerCalssTest {
    public static void main(String[] args) {
        Person p=new Person();
        //静态内部类
        Person.DD dd = new Person.DD();
        dd.show();
        //创建非静态内部类
        Person.EE ee = p.new EE();
        ee.sing();
    }

}
class Person{
    private String name;
    private int age;
    public void eat(){
        System.out.println("吃饭");}
    //成员内部类静态
    static class DD{
        public void show(){
            System.out.println("dd");
        }
    }
    //非静态
    class EE{
        String name;
        public void sing(){
            System.out.println("唱歌");
            Person.this.eat();
        }
        EE(){

        }
    }
    {
        //局部内部类(代码块内)
        class BB{

        }
    }
    public void method(){
        //局部内部内(方法内)
        class AA{

        }
    }
    public Person(){
        //局部内部类(构造期内)
        class CC{

        }
    }
}