package exercise;

public class CheomEx1 {
    public static void main(String[] args) {
        Cheomsungdae user1 = Cheomsungdae.getInstance();
        Cheomsungdae user2 = Cheomsungdae.getInstance();

        Cheomsungdae.info();

        if(user1 == user2) {
            System.out.println("same");
        }
    }
}
