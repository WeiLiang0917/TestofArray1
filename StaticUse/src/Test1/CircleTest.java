package Test1;

/**
 * @author WeiLiang
 * @date 2021/6/16 - 12:38
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1=new Circle();
        Circle c2=new Circle();
        System.out.println(c1.getId());
        System.out.println(c2.getId());
        System.out.println(Circle.getTotal());

    }
}
class Circle{
    private  double radius;
    private  int id;

    public Circle() {
        id=init++;
        total++;
    }

    public Circle(double radius) {
        this();
        this.radius = radius;
    }

    private static int total;//创建的圆的个数
    private static int init=1001;//static声明的属性被所有对象共享概念
    public double findArea(){
        return Math.PI*radius*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    public static int getTotal() {
        return total;
    }


}