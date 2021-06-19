package MXtest;

/**
 * @author WeiLiang
 * @date 2021/5/27 - 22:58
 */
public class StudentTest {
    public static void main(String[] args) {
        Stdent stu1=new Stdent("20");
        stu1.eat();
        //创建一个数组学生20个随机班级
        Student[] stu=new Student[20];
        for (int i = 0; i <stu.length ; i++) {
            stu[i]=new Student();
            stu[i].number=i+1;
            stu[i].state=(int)(Math.random()*6+1);
          stu[i].score=(int)(Math.random()*101);

//            System.out.println("学生学号"+nm+"班级"+st+"成绩"+sc);


        }
        for (int i = 0; i <stu.length ; i++) { System.out.println(stu[i].toString());}
        System.out.println("*************");
        for (int i = 0; i <stu.length ; i++) {
            if (stu[i].state==3){
                System.out.println(stu[i]+"是三年级的");
            }
        }
        System.out.println("***********");
        for (int i = 0; i < stu.length ; i++) {
                for (int j = 0; j < stu.length - i-1; j++) {
                    if (stu[j].score<stu[j+1].score){
                        Student temp=stu[j];
                        stu[j]=stu[j+1];
                        stu[j+1]=temp;
                    }
                }

        }

        for (int i = 0; i <stu.length-1 ; i++) { System.out.println(stu[i].toString());}

    }

}
class Student{
    int number;//学号
    int state;//年级
    int score;//成绩

    public Student() {
    }

    public Student(int number, int state, int score) {
        this.number = number;
        this.state = state;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", state=" + state +
                ", score=" + score +
                '}';
    }


}
