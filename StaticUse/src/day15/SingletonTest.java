package day15;

/**
 * @author WeiLiang
 * @date 2021/6/16 - 18:42
 */
public class SingletonTest
{
}
class Bank1{
    private Bank1(){
    }
//    public static Bank instance=new Bank();//暴露出去可以被恶意操作置空
    public static final Bank1 b =new Bank1();//算是单例模式
}