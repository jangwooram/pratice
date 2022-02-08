package inheritance;

public class CheckingAcc extends Account{

    String cardNo; //체크카드 번호

    public CheckingAcc(String accountNo, String ownerName, int blance, String cardNo) {
        this.accountNo = accountNo;
        this.ownerName = ownerName;
        this.blance = blance;
        this.cardNo = cardNo;
    }


    //결제 메소드

    int pay(String cardNo, int amount) {

    }
}
