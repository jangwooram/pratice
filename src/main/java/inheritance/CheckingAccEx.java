package inheritance;

public class CheckingAccEx {
    public static void main(String[] args) {
        CheckingAcc ch = new CheckingAcc("123-123","철수",1000,"2222-2222");
        ch.deposit(50000);

        try {
            int paidAmount = ch.pay("2222-2222",5000);
            System.out.println("지불액 = " + paidAmount);
            System.out.println("잔액 = " + ch.blance);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
