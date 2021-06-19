package FinalTest;

/**
 * @author WeiLiang
 * @date 2021/6/16 - 14:51
 */
/*
* final:最终的
 * 1.final可以用来修饰的结构，类，方法，变量
 * 2.final用来修饰一个类:表示不能被继承
 *               比如:String类，System，StringBuffer类
 * 3.final用来修饰一个方法:表示方法不能被重写
 *                       比如，Object类中的getClass();//获取当前对象所处的类
 *
 *4.final用来修饰一个变量:此时的"变量"称为是一个常量;
 *              4.1final修饰属性:可以考虑赋值的位置有：显式初始化，代码块中初始化，构造器初始化，
 *                      不能在方法里，因为构造器生成之后属性final需要初始化，但是没有赋值，所以
 *                      会报错
 *
*
* */
public class FinalTest {
}
final class FinalA{
}