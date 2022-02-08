package inheritance;
//마이너스통장
public class CreditLineAcc extends Account{
    int creditLine; // 마이너스 한도
    public CreditLineAcc(String accountNo, String ownerName, int blance, int creditLine) {
        super(accountNo, ownerName, blance);
        this.creditLine = creditLine;
    }

    @Override
    int withdraw(int amount) throws Exception {
        if (blance+creditLine < amount) {
            throw new Exception("인출이 불가능 합니다.");
        }
        blance-=amount;
        return amount;
    }
}
