package MXtest;

/**
 * @author WeiLiang
 * @date 2021/5/30 - 12:08
 */
/*
例子：已有一个数列 f(0)=1,f(1)=4,f(n+2)=2*f(n+1)+f(n)

//其中n是大于0的整数，求f(10)
 */
public class diguitest {
    public static void main(String[] args) {
diguitest diguitest=new diguitest();

        System.out.println(diguitest.f(10));
        }
    public int f(int n){
       /* if(n==0){
            return 1;
        }else if(n==1){
            return 4;
        }else {
            return 2*f(n-1)+f(n-2);
        }
*/

        int i = 1;
        for (; i <= n; i++) {
            i=2*f(n-1)+f(n-2);
        }
        return i;
    }

}
