
package objectClass;

public class AccountEx1 {
    public static void main(String[] args) {
        Account chulsu; //객체 변수 선언
        chulsu = new Account(); //객체 생성(인스턴스화)
        int amount; // 금액을 담는 변수

        chulsu.accountNo = "123-123-123";
        chulsu.ownerName = "철수";
        chulsu.blance = 1000;

        Account gildong = new Account();
        gildong.accountNo = "321-321-321";
        gildong.ownerName = "길동";
        gildong.blance = 0;

        chulsu.deposit(5000);
        gildong.deposit(10000);

        amount = gildong.withdraw(4000);
        System.out.println("예금주 = " + chulsu.ownerName);
        System.out.println("잔액 = " + chulsu.blance);
        System.out.println("===============");
        System.out.println("예금주 = " + gildong.ownerName);
        System.out.println("찾은 돈 = " + amount);
        System.out.println("잔액 = " + gildong.blance);
    }
}

