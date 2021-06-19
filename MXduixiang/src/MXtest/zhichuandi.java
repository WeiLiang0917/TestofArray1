package MXtest;

/**
 * @author WeiLiang
 * @date 2021/5/29 - 20:14
 */
public class zhichuandi {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        zhichuandi a1=new zhichuandi();
        //a1.swap(a,b);
        //System.out.println(a+""+b);
        char[] c=new char[]{'a','d','f'};
        System.out.println(c);//adf
        String[] d=new String[]{"a","c"};
        System.out.println(d);//[Ljava.lang.String;@1540e19d
        char[] f=new char[10];
        System.out.println(f);//因为动态数组还没赋值，全是空


    }
    public int swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+""+b);
        return a;

    }
}
