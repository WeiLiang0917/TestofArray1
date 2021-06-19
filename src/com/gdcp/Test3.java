package com.gdcp;

/**
 * @author WeiLiang
 * @date 2021/5/17 - 21:33
 */
/*
* (1)创建一个名为ArrayTest的类，在main方法中声明两个int数组
* (2)使用大括号{}把array1初始化为8个素数2，3，5，7，11，13，17，19
* (3)显示array1的内容
* (4)赋值array2变量等于array1,修改array2中的偶索引元素，
* 使其跟索引值一样打印出array1
*
* */
public class Test3 {
    public static void main(String[] args) {
        int[] array1,array2;
        array1=new int[]{2,3,5,7,11,13,17,19};
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]+"\t");
        }
        System.out.println(" ");
        array2=array1;
        for (int i = 0; i < array2.length; i++) {
            if (i%2==0){
                array2[i]=i;
            }
            System.out.print(array2[i]+"\t");
        }
        System.out.println(" ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]+"\t");
        }

    }
}
