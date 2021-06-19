package Box;

import org.junit.Test;

/**
 * @author WeiLiang
 * @date 2021/6/15 - 18:47
 */
public class ClassBox {
    @Test
    public void test6(){
        Object o2;
      if (true)
          o2=new Integer(1);
      else
          o2=new Double(2.0);
        System.out.println(o2);
    }
    //String类型转化为--->基本数据类型，包装类调用包赚类的parseXxx
    @Test
    public void test5(){
        String str1="123";
//        int num1=(int)str1; 不是同一类型不允许
//        Integer in1=(Integer)str1;//无子父类关系，无关系不能强转
        //转之前要确认String内容是否符合转换的基本数据类型要求，
        // 如果123a转换为int就会报错
        Integer.parseInt(str1);//将String转化为基本数据类型int
    }
        //基本数据类型，包装类--->String类型；调用String重载的valueOf(Xxx xxx)
    @Test
    public void test4(){

        int i1=10;
        //方式一 连接运算
        String s1=i1+"";//用""来自动类型提升
        //方式二 调用String的valeOf
        float f1=12.1f;
        String str2 = String.valueOf(f1);//"12.1"

    }

/*
* JDK5.0新特性，自动装箱与自动拆箱
* */
    @Test
    public  void test3(){
        //自动装
 int i=10;
 Integer in=i;
 //自动拆箱
 int i2=in;
    }
    //包装类-->基本数据类型:调用包装类的xxxValue()
    @Test
    public void test2(){
        Integer in1 = new Integer(12);
        int i1 = in1.intValue();
        System.out.println(i1+1);
        Float f1 = new Float(12.3);
        float f2 = f1.floatValue();
        System.out.println(f2+1);
    }
    //基本数据类型--->包装类：调用包装类的构造器
    @Test
    public void test1(){
    int num1=10;
        Integer in1 = new Integer(num1);
        System.out.println(in1.toString());
        Integer in2 = new Integer("123");
        System.out.println(in2.toString());
        //出现异常
//        Integer in3 = new Integer("13ab");
//        System.out.println(in3.toString());
        Float f1 = new Float(12.3f);
        Float f2 = new Float("12.3");

        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean("True");//忽略大小写
        Boolean b3 = new Boolean("true123");//报错
        BooleanTest b=new BooleanTest();
        System.out.println(b.ist);//false
        System.out.println(b.Ist);//null
    }
}
class BooleanTest{
    boolean ist;
    Boolean Ist;
}
