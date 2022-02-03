package objectClass;

public class AccountEx2 {
    public static void main(String[] args) {

        int amount; // 금액을 담는 변수

        Account younghee = new Account("234-432-453", "영희", 10); //객체 생성(인스턴스화)

        Account chanho = new Account("874-365-780", "찬호", 0);

        younghee.deposit(5000);
        chanho.deposit(10000);

        chanho.withdraw(3000);

        System.out.println();

        printAccount(younghee);
        printAccount(chanho);
    }

    //통장 자료 출력 메소드
    static void printAccount(Account obj) {
        System.out.println("계좌번호 " + obj.accountNo);
        System.out.println("예금주 " + obj.ownerName);
        System.out.println("잔액 " + obj.blance);
        System.out.println("===============");

    }
}
