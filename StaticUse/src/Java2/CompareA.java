package Java2;

/**
 * @author WeiLiang
 * @date 2021/6/17 - 13:48
 */
/*
* JDK8除了定义全局常量和抽象方法之外，还可以定义静态方法，默认方法
*
* */
public interface CompareA {
    //静态方法
    public static void method1(){
        System.out.println("A1");
    }
    //默认方法
    public default void method2(){
        System.out.println("A2");
    }
}
