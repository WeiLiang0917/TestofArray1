package ObjectTest;

/**
 * @author WeiLiang
 * @date 2021/6/15 - 18:16
 */
public class CircleTest {
    public static void main(String[] args){
    Cicle c=new Cicle("red",2,3.0);
    Cicle b=new Cicle("red",2,3.0);
        boolean equals = c.equals(b);

        System.out.println(equals+ c.toString());
    }

}

