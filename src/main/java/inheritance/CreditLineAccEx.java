package inheritance;

public class CreditLineAccEx {

    public static void main(String[] args) {

        CreditLineAcc wr = new CreditLineAcc("123-123", "wooram", 30, 100000);

        try {
            int minus = wr.withdraw(70000);
            System.out.println(minus + "인출 했습니다.");
            System.out.println("잔액 = " + wr.blance);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
