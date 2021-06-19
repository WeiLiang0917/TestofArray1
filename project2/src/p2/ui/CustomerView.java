package p2.ui;

import p2.util.CMUtility;
import p2.JavaBean.Customer;
import p2.service.CustomerList;

/**
 * @author WeiLiang
 * @date 2021/6/6 - 9:48
 */
public class CustomerView {
    private CustomerList customerList=new CustomerList(10);

    public CustomerView() {
        Customer cust=new Customer("张三",'男',20,"1001","222@.qq.com");
        customerList.addCustomer(cust);
    }

    public static void main(String[] args){
        CustomerView customerView=new CustomerView();
        customerView.enterMainMenu();

    }
    //显示界面
    public void enterMainMenu(){
        boolean isFlag=true;
        while (isFlag){
            System.out.println("-----------客户信息管理---------------\n");
            System.out.println("           1.添加客户");
            System.out.println("           2.修改客户");
            System.out.println("           3.删除客户");
            System.out.println("           4.查看客户列表");
            System.out.println("           5.退  出 \n");
            System.out.print("           请输入(1-5)");
            char menu = CMUtility.readMenuSelection();
            switch (menu){
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();

                    break;
                case '5':
                    System.out.println("是否确认退出Y/N");
                    char isExit = CMUtility.readConfirmSelection();
                    if (isExit=='Y'){
                        isFlag=false;
                    }
//                    break;
            }
        }
        //获取用户选择1-5

    }
    //添加客户
    private void addNewCustomer(){
//        System.out.println("添加客户的操作");
        System.out.println("-----------添加客户---------------\n");
        System.out.print("姓名:");
        String name = CMUtility.readString(10);
        System.out.print("性别:");
        char gender = CMUtility.readChar();
        System.out.print("年龄:");
        int age = CMUtility.readInt();
        System.out.print("电话:");
        String phone = CMUtility.readString(13);
        System.out.print("邮箱");
        String email = CMUtility.readString(30);

        //将上述封装到对象中
        Customer customer=new Customer(name,gender,age,phone,email);
        boolean isSuccess = customerList.addCustomer(customer);
        if (isSuccess){
            System.out.println("--------添加完成-----------");
        }else {
            System.out.println("客户目录已满");
        }


    }
    //修改
    private void modifyCustomer(){
//        System.out.println("添加客户的操作");
        System.out.println("-----------修改客户---------------\n");
        Customer cust;
        int number;
        for (;;) {
            System.out.println("请选择修改客户的编号(-1退出)");
            number = CMUtility.readInt();
            if (number==-1){
                return;
            }
         cust = customerList.getCustomer(number - 1);
            if (cust==null){
                System.out.println("无法找到指定客户");
            }else {

                break;
            }
        }
        System.out.println("姓名{"+cust.getName()+")");
        //修改客户信息
        String name=CMUtility.readString(10,cust.getName());
        System.out.println("性别("+cust.getGender()+")");
        char gender = CMUtility.readChar(cust.getGender());
        System.out.println("年龄{"+cust.getAge()+")");
        int age = CMUtility.readInt(cust.getAge());
        System.out.println("电话{"+cust.getPhone()+")");
        String phone = CMUtility.readString(13,cust.getPhone());
        System.out.println("邮箱{"+cust.getEmail()+")");
        String email = CMUtility.readString(30, cust.getEmail());
        Customer newcust = new Customer(name, gender, age, phone, email);
        boolean isReplace = customerList.replaceCustomer(number - 1, newcust);
        if (isReplace){
            System.out.println("替换成功");
        }else {
            System.out.println("失败");
        }


    }

    //删除
    private void deleteCustomer(){
//        System.out.println("添加客户的操作");
        System.out.println("-------------删除客户操作-----------");
        int number;
       for (;;){
           System.out.println("请选择删除客户的编号(-1退出)");
           number = CMUtility.readInt();
           if(number==-1){
            return;
           }
           Customer customer = customerList.getCustomer(number - 1);
           if(customer==null){
               System.out.println("无法找到");
           }else {
               break;
           }
       }
    //找到指定客户
        System.out.println("是否确认删除Y/N");
        char isDelete = CMUtility.readConfirmSelection();
        if (isDelete=='Y'){
            boolean deleteSuccess = customerList.deleteCustomer(number - 1);
            if (deleteSuccess){
                System.out.println("删除成功");
            }
            else {
                System.out.println("失败");
            }
        }
    }

    //显示
    private void listAllCustomers(){
        System.out.println("查看客户的操作");
        System.out.println("-------------------客户列表------------------");
        int total = customerList.getTotal();
        if (total==0){
            System.out.println("没有客户记录");
        }else {
            System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
            Customer[] cuts = customerList.getAllCustomers();
            for (int i = 0; i < total; i++) {
                Customer cut = cuts[i];
                System.out.println((i+1)+"\t\t"+
                        cut.getName()+"\t"+
                        cut.getGender()+"\t\t"+
                        cut.getAge()+"\t\t"+
                        cut.getPhone()+"\t\t"+
                        cut.getEmail()+"\t");
            }
        }
        System.out.println("-------------------客户列表完成------------------");
    }

}
