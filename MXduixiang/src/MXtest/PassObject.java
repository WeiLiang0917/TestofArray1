package MXtest;

/**
 * @author WeiLiang
 * @date 2021/5/30 - 11:47
 */
public class PassObject {
    public static void main(String[] args) {
        PassObject ps=new PassObject();
        Circle c=new Circle();
        ps.printAreas(c,5);
        System.out.println("当前c的半径为"+c.redius);
    }
    public  void printAreas(Circle c,int time){
        System.out.println("半径\t\t面积");
        int i = 1;
        for (; i <=time; i++) {
            c.redius=i;
            System.out.println("半径为"+c.redius+"面积为"+c.findArea());
        }
        c.redius=time+1;
    }
}
