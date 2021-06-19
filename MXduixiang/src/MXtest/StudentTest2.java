package MXtest;

/**
 * @author WeiLiang
 * @date 2021/5/27 - 22:58
 */
public class StudentTest2 {
    public static void main(String[] args) {
        //创建一个数组学生20个随机班级
        Student2[] stu=new Student2[20];
        for (int i = 0; i <stu.length ; i++) {
            stu[i]=new Student2();
            stu[i].number=i+1;
            stu[i].state=(int)(Math.random()*6+1);
          stu[i].score=(int)(Math.random()*101);
//            System.out.println("学生学号"+nm+"班级"+st+"成绩"+sc);
        }
        StudentTest2 studentTest2=new StudentTest2();
        studentTest2.print(stu);
        System.out.println("**********");
        studentTest2.searchState(stu,4);
        System.out.println("**********");
        studentTest2.paixu(stu);
        studentTest2.print(stu);

    }
//遍历student2[]数组的操作
    public void print(Student2[] stu){
        for (int i = 0; i <stu.length-1 ; i++) { System.out.println(stu[i].toString());}
    }

    /**
     *
     * @param stu
     * @param state
     */
    public void searchState(Student2[] stu,int state){
        for (int i = 0; i <stu.length ; i++) {
            if (stu[i].state==state){
                System.out.println(stu[i]+"是三年级的");
            }
        }
    }
    //排序
    
    /**
     *
     * @param stu
     */
    public void paixu(Student2[] stu){
        for (int i = 0; i < stu.length ; i++) {
            for (int j = 0; j < stu.length - i-1; j++) {
                if (stu[j].score<stu[j+1].score){
                    Student2 temp=stu[j];
                    stu[j]=stu[j+1];
                    stu[j+1]=temp;
                }
            }

        }
    }
}

class Student2{
    int number;//学号
    int state;//年级
    int score;//成绩

    @Override
    public String toString() {
        return "Student2{" +
                "number=" + number +
                ", state=" + state +
                ", score=" + score +
                '}';
    }
}
