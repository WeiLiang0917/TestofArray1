package Singleton;

/**
 * @author WeiLiang
 * @date 2021/6/16 - 13:53
 */
public class MainDemo {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("***"+args[i]);
            int num = Integer.parseInt(args[i]);

            System.out.println("***"+num);
        }
    }
}
