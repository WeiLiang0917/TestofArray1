package Singleton;

/**
 * @author WeiLiang
 * @date 2021/6/16 - 13:22
 */
/*
* 单例设计模式
* 1.所谓类的单例设计模式，就是采取一定的方法保证在整个的软件系统中，
* 对某个类只能存在一个对象实例
* 2.如何实现
* */
public class SingletonTest1 {
    public static void main(String[] args) {
        Bank bank1=Bank.getInstance();
        Bank bank2=Bank.getInstance();
        System.out.println(bank1==bank2);//true
    }
}
//饿汉式
class Bank{
    //1.私有化类的构造器
    private Bank(){

    }
    //2内部创建类的对象
    //4要求此对象也必须声明为静态的
    private static Bank instance=new Bank();
    //3提供公共的静态的方法返回类的对象
    public static Bank getInstance(){
        return instance;
    }
}
