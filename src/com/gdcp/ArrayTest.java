package com.gdcp;

/**
 * @author WeiLiang
 * @date 2021/5/12 - 8:59
 */
public class ArrayTest {
    public static void main(String[] args) {
        //①一维数组的声明和初始化


        int num;//声明
        num=1;//初始化
        int id=1001;//声明+初始化
        int [] ids;//声明
        //1.1静态初始化:数组的初始化和数组元素的赋值操作同时进行
        ids=new int[]{1001,2001};//声明+初始化
        //1.2动态初始化:数组的初始化和数组元素的赋值操作分开进行
        String[] names=new String[5];


        //错误
//        int[] aar1=new int[];
//        int[5] arr2=new int[5];
//        int[] arr3=new int[3]{123,123,123};


       // 总结:数组一旦初始化完成，其长度确定了

//②如何调用数组的指定位置的元素
        //通过角标方式，索引，下角标
        //数组的角标(或索引)从0开始到长度-1
        names[0]="1";
        names[1]="2";
        names[2]="3";
        names[3]="4";
        names[4]="5";

//③如何获取数组的长度
        //属性:length
        System.out.println(names.length);
//④如何遍历数组
        for (int i=0;i<=names.length-1;i++){
            System.out.println(names[i]);
        }
//⑤数组元素的默认初始化
        //
//⑥数组的内存解析
    }
}
