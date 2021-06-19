package Java1;

/**
 * @author WeiLiang
 * @date 2021/6/16 - 21:03
 *//*

 接口的使用
 1.接口使用interface来定义
 2.java中，接口与类是并列的
 3.如何定义接口，定义接口中的成员
        3.1 JDK7及以前；只能定义全局常量和抽象方法
                >全局常量 public static final的,但是书写是可以省略不写
                >抽象方法 public abstract
        3.2 JDK8：除了定义全局常量和抽象方法之外，还可以定义静态方法，默认方法
4接口中不能定义构造器！意味着接口不能实例化
5.Java开发中，通过让类去实现(implements)接口来使用
        如果实现类覆盖(实现)了接口所以抽象方法，则此实现类可以实例化
         如果实现类没有覆盖接口所有的抽象方法，则实现类仍然为抽象类
6. Java类可以实现多个接口--->弥补了单继承性
    格式:class A extends B implements C,D
7.接口跟接口之间的关系，可以多继承
8.接口具体的使用，体现多态性
9.接口，实际上可以看做成一种规范
面试题:抽象类与接口有哪些异同?

 */
public class InterfaceUse {
    public static void main(String[] args) {
        Plane p1=new Plane();
        p1.fly();
    }
}
interface Flyable{
    //全局常量
    public static final  int MAX_SPEED=7900;//第一宇宙速度
    public static  final  int MIN_SPEED=1;//可以省略public static final
    //抽象方法
    public abstract void fly();
    void stop();


}
interface shoot{
    public abstract void shoot1();
}
class Plane extends Object implements Flyable,shoot{

    @Override
    public void fly() {
        System.out.println("ss");
    }

    @Override
    public void stop() {
        System.out.println("ss");
    }

    @Override
    public void shoot1() {
        System.out.println("射击");
    }
}
abstract class Kite implements Flyable{

    @Override
    public void fly() {

    }


}
//******************************
//接口多继承
interface AA{
}
interface BB{}
interface CC extends AA,BB{}