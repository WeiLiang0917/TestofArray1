package com.gdcp;

import java.util.Arrays;

/**
 * @author WeiLiang
 * @date 2021/5/19 - 9:21
 */
/*
* java.util.Array:操作数组的工具类,里面定义了很多操作数组的方法
*
*
* */
public class ArraysTest {
    public static void main(String[] args) {
        //1.boolean equals(int[]a,int[]b)
        //先比较地址，如地址一样返回true 如果不一样比较长度，长度一样比较内容
        int[]arr1=new int[]{1,2,3,4};
        int[]arr2=new int[]{1,3,2,4};
        boolean isEquals= Arrays.equals(arr1,arr2);
        System.out.println(isEquals);//true
        //2.String toString(int[] a)输出数组信息
        System.out.println(Arrays.toString(arr1));
        //3.void fill(int[] a,int val)将指定值填充到数组中
        //将int[]里面的值全部都替换成val
        Arrays.fill(arr1,10);
        System.out.println(Arrays.toString(arr1));
        //4.void sort(int[] a)//对数组进行排序
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        //5.int bianraySearch(int[] a,int key)//查找key在int里面的下标位置
        // ，如果查找不到返回负数
        int[]arr=new int[]{123,21,2,123,432,53,64,7457,546,312};
        int index = Arrays.binarySearch(arr, 7457);
        System.out.println(index);
        if (index>0){
            System.out.println("找到了");
        }else {
            System.out.println("找不到");
        }

    }
}
