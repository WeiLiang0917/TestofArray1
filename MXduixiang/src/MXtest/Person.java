package MXtest;

/**
 * @author WeiLiang
 * @date 2021/6/13 - 18:51
 */
public class Person {
    private  String age;
    protected  int name;

//    public Person() {
//    }

    public Person(String age){
        this.age=age;
    }
    public void show(){
        System.out.println("表演");
    }
    public void eat(){
        show();
        System.out.println("吃饭");
    }
}
