package com.gdcp;

/**
 * @author WeiLiang
 * @date 2021/5/17 - 22:37
 */
public class erfen {
    public static void main(String[] args) {
        int[] arr2=new int[]{-1,1,2,5,7,11,12,65,711};
        int dest1=1;
        int head=0;//初始的首索引
        int end=arr2.length-1;//初始的末索引
        boolean isFlag1=true;
        while (head<=end){
            int middle=(head+end)/2;
            if (dest1==arr2[middle]){
                System.out.println("找到为"+middle);
                isFlag1=false;
                break;
            }else if (arr2[middle]>dest1){
                end=middle-1;
            }else {
                head=middle+1;
            }
        }
        if (isFlag1){
            System.out.println("没找到");
        }
    }
}
