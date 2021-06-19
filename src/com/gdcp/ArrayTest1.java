package com.gdcp;

/**
 * @author WeiLiang
 * @date 2021/5/12 - 9:15
 */
/*
* 默认值
* 数组元素是整型:0
* 数组元素是浮点型:0.0
* 数组元素是char型:0或'\u0000',非'0'
* 数组元素是boolean型:false
* 数组元素是引用数据类型:null
* */
/*
* //⑥数组的内存解析
* */
public class ArrayTest1
{
    public static void main(String[] args) {
        //⑤数组元素的默认初始化
        int[] arr=new int[4];
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        //⑥数组的内存解析
    }
}
