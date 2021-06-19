package Box;

import org.junit.Test;

/**
 * @author WeiLiang
 * @date 2021/6/15 - 19:32
 */
public class BoxTest {
    @Test
    public  void test3(){
        Integer i1=new Integer(1);
        Integer i2=new Integer(1);
        System.out.println(i1==i2);//flase地址值不一样
        //Integer内部定义了IntegerCache结构，IntegerCache种定义了Integer[]
        //保存了-128-127的范围的整数，如果我们使用自动装箱的方式，给Integer赋值范围在
        //-128-127之间，可以直接使用数据内的元素，不用再去new
        //目的，提高效率
        Integer i3=1;
        Integer i4=1;
        System.out.println(i3==i4);//true 自动拆箱
        Integer i5=128;//相当于new一个对象
        Integer i6=128;
        System.out.println(i5==i6);//flase 缓存-128-127
    }
}
