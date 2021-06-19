package Singleton;

/**
 * @author WeiLiang
 * @date 2021/6/16 - 18:22
 */
public class Singletortest5 {
}
class Person{
    private Person(){
    }
    static   Person p=new Person();
    public static Person getPerson(){
        return p;
    }
}