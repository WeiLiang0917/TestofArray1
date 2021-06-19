package Java1;

/**
 * @author WeiLiang
 * @date 2021/6/16 - 21:24
 */
/*
* 接口的使用
* 1.满足多态性
* 2.接口定义了规范
* 3.开发中，体会面向接口编程
* */
public class UsbTest {
    public static void main(String[] args) {
        Computer c=new Computer();
        //1.创建了接口的非匿名实现类的非匿名对象
        Flash flash = new Flash();
        c.transferData(flash);
        //2.非匿名实现类的匿名对象
        c.transferData(new Printer());
        //3.创建接口的匿名实现类的非匿名对象
        USB phoone=new USB() {
            @Override
            public void start() {
            }
            @Override
            public void stop() {
            }
        };
        c.transferData(phoone);
        //4.创建接口的匿名实现类的匿名实现对象
        c.transferData(new USB() {
            @Override
            public void start() {

            }

            @Override
            public void stop() {

            }
        });
    }
}
class Computer{
    public void transferData(USB usb){
        usb.stop();
        usb.start();
    }
}
interface USB{
    void start();
    void stop();
}
class Flash implements USB{
    @Override
    public void start() {
        System.out.println("U开始");
    }
    @Override
    public void stop() {
        System.out.println("U结束");
    }
}
class Printer implements USB{

    @Override
    public void start() {
        System.out.println("打开始");
    }

    @Override
    public void stop() {
        System.out.println("打结束");
    }
}