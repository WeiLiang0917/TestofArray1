package com.gdcp;

/**
 * @author WeiLiang
 * @date 2021/5/19 - 9:05
 */
//数组的冒泡排序的实现
    //两两对比
public class BubbleSortTest {
    public static void main(String[] args) {
        int[]arr=new int[]{123,21,2,123,432,53,64,7457,546,312};
        //冒泡排序
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+"\t");
        }
    }
}
