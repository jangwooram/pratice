package objectClass;

public class Account {
    // field - 객체의 데이터가 저장되는곳
    String accountNo; // 계좌번호
    String ownerName; //통장주인이름
    int blance; // 잔액


    // constructor(생성자) - 객체 생성시 초기화 역할
    public Account(String accountNo, String ownerName, int blance) { // 생성자는 클래스 이름과 동일하다.
        this.accountNo = accountNo; // this 는 내부 필드, this가 없으면 파라메터
        this.ownerName = ownerName;
        this.blance = blance;
    }

    // 기본 생성자
    public Account(){

    }

    //   method - 객체의 기능

    //예금
    void deposit(int amount) {
        blance += amount; // blance = blance + amount
    }      // void 타입 부분에는 return이 잇어야 한다.(void는 리턴 안해도됨)

    //출금
    int withdraw(int amount) throws Exception {

        if(blance < amount) {
            throw new Exception("잔액이 부족합니다");
        }
        blance -= amount; // blance = blance - amount

        return amount;
    }

}
