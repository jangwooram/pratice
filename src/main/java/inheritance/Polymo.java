package inheritance;

public class Polymo {
    public static void main(String[] args) {
            Account obj1 = new Account();
            obj1.deposit(1000);
            CheckingAcc obj2 = new CheckingAcc();
            Account obj3 = new CheckingAcc();
            Account obj4 = new CreditLineAcc();
            CheckingAcc obj5 = (CheckingAcc) obj3;
            cast(obj1);
            cast(obj3);
    }

    static void cast(Account acc) {
        if(acc instanceof CheckingAcc) {
            CheckingAcc obj5 = (CheckingAcc)acc;
            System.out.println("succ");
        }else {
            System.out.println("fail");
        }
    }
}
