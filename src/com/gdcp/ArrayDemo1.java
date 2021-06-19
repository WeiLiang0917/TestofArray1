package com.gdcp;

import java.util.Scanner;

/**
 * @author WeiLiang
 * @date 2021/5/12 - 9:57
 */
public class ArrayDemo1 {
    public static void main(String[] args) {
        //使用Scanner读取学生输入人数，以及分数
        //1.使用Scanner读取学生个数
        Scanner number=new Scanner(System.in);
        System.out.println("请输入学生人数:");
        int number1 = number.nextInt();

//2.创建数组，存储学生成绩:动态初始化
        int[] scores = new int[number1];

//3.给数组中的元素赋值
        System.out.println("请输入"+number1+"个学生成绩");
        int maxScore=0;
        for (int i = 0; i < scores.length; i++) {
            scores[i]=number.nextInt();
            //4.给数组的元素最大值:最高分
            if (maxScore<scores[i]){
                maxScore=scores[i];
            }
        }
//4.给数组的元素最大值:最高分

       /* for (int i = 0; i < scores.length; i++) {

        }*/
//5.根据每个学生成绩最高分差值，得到每个学生等级并且输出
        char level;
        for (int i = 0; i < scores.length; i++) {
            if (maxScore-scores[i]<=10){
                level='A';
            }else if (maxScore-scores[i]<=20){
                level='B';
            }else if (maxScore-scores[i]<=30){
                level='C';
            }else {
                level='D';
            }
            System.out.println("student"+i+"score"+scores[i]+"is"+level);
        }
    }
}
