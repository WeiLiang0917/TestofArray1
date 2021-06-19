package com.gdcp;

/**
 * @author WeiLiang
 * @date 2021/5/17 - 21:21
 */
public class Test2 {
    public static void main(String[] args) {
        int[]arr=new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)(Math.random()*90)+1;
            System.out.println(arr[i]);
        }

        //求最大值
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
        //最小值
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("最小"+min);
        //总和
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=+arr[i];
        }
        System.out.println("总和"+sum);
        int pin;
        pin=sum/arr.length;
        System.out.println("平均数"+pin);
        //平均数

    }
}
