package com.gdcp;

import javax.swing.*;

/**
 * @author WeiLiang
 * @date 2021/5/17 - 22:19
 */
public class Test4 {
    public static void main(String[] args) {
        //数组的反转方式1
        String[] arr=new String[]{"aa","BB","DD","CC"};
//        for (int i = 0; i <arr.length/2 ; i++) {
//            String temp=arr[i];
//            arr[i]=arr[arr.length-i-1];
//            arr[arr.length-i-1]=temp;
//        }
       /* for (int i = 0, j =arr.length-1 ; i<j;i++,j--) {
String temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/
       //查找(或搜索)
        //线性查找
        String dest="BB";
        boolean isFlag=true;
        for (int i = 0; i < arr.length; i++) {
            if(dest.equals(arr[i])){
                System.out.println(""+i);
                isFlag=false;
                break;
            }
        }
        if (isFlag){
            System.out.println("没有");
        }

    }
}
