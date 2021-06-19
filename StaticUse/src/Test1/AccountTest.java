package Test1;

/**
 * @author WeiLiang
 * @date 2021/6/16 - 12:49
 */
public class AccountTest {
    public static void main(String[] args) {
        Account a1=new Account();
        Account a2=new Account("123",100.0);
        Account.setInterestRate(0.012);
        Account.setMinMoney(100);

    }
}
