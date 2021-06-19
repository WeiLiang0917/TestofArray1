package aftertest;

import java.util.Scanner;
import java.util.Vector;

/**
 * @author WeiLiang
 * @date 2021/6/15 - 19:41
 */
public class ScoreTest {
    public static void main(String[] args) {
        //1.实例化Scanner
        Scanner a1=new Scanner(System.in);
        //2创建Vector对象，Vector v=new Vector();
        Vector v=new Vector();
//        相当于原来的数组
        //3通过for(;;)或while(true)方式给Vector中添加数组，
        int max=0;
        for (;;){
            System.out.println("请输入学生成绩(输入负数结束)");
            int score = a1.nextInt();

            //3.2输入是负数时候跳出循环
            if (score<0){
                break;
            }
            if (score>100){
                System.out.println("输入数据非法，重新输入");
                continue;//跳出当次循环
            }
            //3.1v.addElement(Object obj)
            //jdk5.0之前
//            Integer inScore=new Integer(score);
//            v.addElement(inScore);//多态
            //jdk5.0之后
            v.addElement(score);//自动装箱
            //4.获取学生最大值
            if(max<score){
                max=score;
            }
        }
        //5.遍历Vector ，得到每个学生成绩，与最大值对比
        char level;
        for (int i = 0; i < v.size(); i++) {
            Object obj=v.elementAt(i);
            //jdk5.0之前
//            Integer inScore=(Integer)obj;
//            int score = inScore.intValue();
            //jdk5.0之后
            int score=(int)obj;
            if (max-score<=10){
                level='A';
            }
            else if(max-score<=20){
                level='B';
            }
            else if(max-score<=30){
                level='C';
            }
            else {
                level='D';
            }
            System.out.println("student"+i+"score is"+score+"level is"+level);

        }
    }
}
