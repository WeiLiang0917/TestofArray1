package com.gdcp;

/**
 * @author WeiLiang
 * @date 2021/5/17 - 16:53
 */
/*
* 打印杨辉三角
* yanghui[i][j]=yanghui[i-1][j-1]+yanghui[i-1][j]
* */
public class YangHuiTest {
    public static void main(String[] args) {
        //1.第一行有一个元素。第n行有n个元素
        //动态初始化二维数组
        int[][]yanghui=new int[10][];
        //元素赋值
        for (int i = 0; i < yanghui.length; i++) {
            yanghui[i]=new int[i+1];
            //给首末元素赋值
            yanghui[i][0]=yanghui[i][i]=1;
            //给每行非首末元素赋值
            if (i>1){
                //从第二个数开始到倒数第二个数结束
                for (int j=1;j<yanghui[i].length-1;j++){
                    yanghui[i][j]=yanghui[i-1][j-1]+yanghui[i-1][j];
                }
            }

        }
        //遍历二维数组
        for (int i = 0; i < yanghui.length; i++) {
            for (int j = 0; j < yanghui[i].length; j++) {
                System.out.print(yanghui[i][j]+" ");
                
            }
            System.out.println();
        }

    }
}
