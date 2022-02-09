package inheritance;

public class CheckingAcc extends Account{

    String cardNo; //체크카드 번호

    public CheckingAcc(String accountNo, String ownerName, int blance, String cardNo) {
        /*this.accountNo = accountNo;
        this.ownerName = ownerName;
        this.blance = blance;*/
        super(accountNo,ownerName,blance); // super는 부모 생성자 호출
        this.cardNo = cardNo;
    }

    public CheckingAcc(){}

    //결제 메소드

    int pay(String cardNo, int amount) throws Exception {
        if (!cardNo.equals(this.cardNo) || blance < amount) {
            throw new Exception("지불이 불가능 합니다.");
        }
        return withdraw(amount);
    }
}
