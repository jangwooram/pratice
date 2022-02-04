package objectClass;

public class AccountEx3 {
    public static void main(String[] args) {
        int amount=0;
        Account ch = new Account("534-765-542", "철수", 0);
        ch.deposit(30000);
        try {
            amount = ch.withdraw(50000);
            System.out.println("인출금액 = " + amount);
        } catch (Exception e) {
            System.out.println("인출금액 = " + amount);
            System.out.println(e.getMessage());
        }
    }
}
