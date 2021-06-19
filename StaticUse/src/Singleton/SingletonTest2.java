package Singleton;

import javax.jws.Oneway;

/**
 * @author WeiLiang
 * @date 2021/6/16 - 13:27
 */
/*
* 单例模式的懒汉式的实现
* */
public class SingletonTest2 {
    public static void main(String[] args) {

    }
}
class Order{
    //1.私有化类的构造器
    private Order(){
    }
    //2.先声明类的对象，没有初始化
    //4.此对象也必须声明为static的
    private static Order instance=null;
    //3.声明一个public ，static的返回当前类的对象的方法
    public static  Order getInstance(){
        if (instance==null){
            instance=new Order();
        }
        return instance;
    }
}