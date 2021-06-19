package com.gdcp;

/**
 * @author WeiLiang
 * @date 2021/5/17 - 15:47
 */
/*
* 二维数组的使用:
* 规定二维数组分为外层数组的元素,内层数组的元素
* int[][] arr=new int[4][3];
* 外层元素:arr[0],arr[1];
* 内层元素:arr[0][0],arr[1][2]等
* ⑤数组元素的默认初始化
⑥数组的内存解析
* */
public class ArrayTest3 {
    public static void main(String[] args) {
        int[][] arr=new int[4][3];
        System.out.println(arr[0]);//指向arr[0]被内层数组赋值到的地址值
        System.out.println(arr[0][0]);//0
        System.out.println("********************");
        double[][]arr3=new double[3][];
        System.out.println(arr3[1]);//null
    }
}
