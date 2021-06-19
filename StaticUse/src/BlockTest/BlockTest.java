package BlockTest;

/**
 * @author WeiLiang
 * @date 2021/6/16 - 14:02
 */
public class BlockTest {
    public static void main(String[] args) {
        String desc = Person.desc;//创建对象时，调用类，静态代码块一同调用
        Person p1=new Person();//创建完对象时，非静态代码块也生成了

    }
}
class Person{
    //属性
    String name;
    int age;
    static String desc="我是一个人";//描述
    //构造器
    public Person(){

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //静态代码块
    static {
        System.out.println("hello static block");
    }
    //非静态代码块
    {
        System.out.println("hello block");
    }
    //方法
    public void eat(){
        System.out.println("吃饭");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}