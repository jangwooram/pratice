package inheritance;

public class Polymo {
    public static void main(String[] args) {
            Account obj1 = new Account();
            obj1.deposit(1000);
            CheckingAcc obj2 = new CheckingAcc();
            Account obj3 = new CheckingAcc();
            Account obj4 = new CreditLineAcc();
    }
}
