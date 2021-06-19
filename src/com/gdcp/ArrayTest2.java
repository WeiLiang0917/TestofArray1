package com.gdcp;

/**
 * @author WeiLiang
 * @date 2021/5/17 - 9:37
 */
/*
//* ①二维数组的声明和初始化
//
//②如何调用数组的指定位置的元素(目前只要除了跟数据库相关的，其他的索引全是从0开始)
//
//③如何获取数组的长度
//
//④如何遍历数组
//
//⑤数组元素的默认初始化
//
//⑥数组的内存解析*/
public class ArrayTest2 {
    public static void main(String[] args) {
         //①二维数组的声明和初始化
//静态初始化
      int[][] arr1=new int[][]{{1,2,3},{1,2,3,4}};
      //动态初始化
        //方式一
        String[][]arr2=new String[3][2];
        //方式二
        String[][]arr3=new String[3][];
        //错误情况
        //String[][]arr4=new String[][3];
//正确写法
        int[]arr4[]=new int[][]{{1,2,3},{1,2,3,4}};
        int[]arr5[]={{1,2,3},{1,2,3,4}};


//②如何调用数组的指定位置的元素(目前只要除了跟数据库相关的，其他的索引全是从0开始)
//
        System.out.println(arr1[0][1]);//2
        System.out.println(arr2[1][2]);//null
        arr3[1]=new String[2];
        System.out.println(arr3[1][0]);//空指针
//③如何获取数组的长度

//
      System.out.println(arr4.length);    //2
      System.out.println(arr4[0].length);//3
//④如何遍历数组
//
      for (int i = 0; i < arr4.length; i++) {
        for (int j = 0; j < arr4[i].length; j++) {
          System.out.println(arr4[i][j]+"");
          
        }
      }
//⑤数组元素的默认初始化
//
//⑥数组的内存解析
    }
}
