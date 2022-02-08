package objectClass;

import java.util.Scanner;

public class BankAppEx {
    private static BankApp[] bankArr = new BankApp[100];
    private static Scanner scan = new Scanner(System.in);
    static int count =0;
    public static void main(String[] args) {

        boolean run = true;

        while (run) {
            System.out.println("----------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.print("선택");

            int selceNo = scan.nextInt();

            if(selceNo == 1) {
                createAcc();
            }
            if(selceNo == 2) {
                accList();
            }
            if(selceNo == 3) {
                deposit();
            }
            if(selceNo == 4) {
                withdraw();
            }
            if(selceNo == 5) {
                System.out.println("시스템 종료");
                run = false;
            }
        }
    }
    private static void createAcc() {
        if(count<100) {

            System.out.println("--------");
            System.out.println("계좌생성");
            System.out.println("--------");

            System.out.print("계좌번호 >");
            String ano = scan.next();
            System.out.print("계좌주 >");
            String owner = scan.next();
            System.out.print("초기금액 >");
            int blance = scan.nextInt();
            BankApp newAcc = new BankApp(ano,owner,blance);

            bankArr[count] = newAcc; // 배열 안에 계좌 정보를 넣음
            count++;
            System.out.println("계좌가 생성되었습니다.");
        } else {
            System.out.println("계좌생성이 마감되었습니다.");
        }
    }
    private static void accList() {
        System.out.println("--------");
        System.out.println("계좌목록");
        System.out.println("--------");

        for (int i=0; i< count; i++) {
            System.out.println(bankArr[i].getAno() + "     " + bankArr[i].getOwner() + "     " + bankArr[i].getBlance());
        }
    }
    private static void deposit() {
        System.out.println("--------");
        System.out.println("예금");
        System.out.println("--------");
        System.out.print("계좌번호");
        String ano = scan.next();
        System.out.print("예금액");
        int deposit = scan.nextInt();
        BankApp account = findAccount(ano);

        if(account == null ){
            System.out.println("계좌가 없습니다,");
        }else {
            account.setBlance(account.getBlance() + deposit);
        }
    }

    private static void withdraw() {
        System.out.println("--------");
        System.out.println("출금");
        System.out.println("--------");
        System.out.print("계좌번호");
        String ano = scan.next();
        System.out.print("출금액");
        int deposit = scan.nextInt();
        BankApp account = findAccount(ano);

        if (account == null) {
            System.out.println("계좌가 없습니다,");
        } else {
            account.setBlance(account.getBlance() - deposit);
        }
    }

    private static BankApp findAccount(String ano){
        BankApp account = null;
        for(int i=0; i< count; i++) {
            if(bankArr[i].getAno().equals(ano)) {
                account = bankArr[i];
                break;
            }
        }
        return account;
    }
}
