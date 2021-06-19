package Singleton;

/**
 * @author WeiLiang
 * @date 2021/6/16 - 13:33
 */
public class SingletonTest3 {
    public static void main(String[] args) {

    }
}
//饿汉
class Man{
    private Man(){
    }
    private static Man a=new Man();
    public static Man getMan(){

        return a;
    }
}
class Women{
   private Women(){}
   private static Women women=null;
   public static Women getWomen(){
       if (women==null){
           women=new Women();
       }
       return women;
   }
}