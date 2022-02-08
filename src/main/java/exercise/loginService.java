package exercise;

public class loginService {
    public static void main(String[] args) {
        MemberService hong = new MemberService();
        boolean result = hong.login("hong", "12345");
        if(result) {
            System.out.println("로그인 되었습니다.");

        } else {
            System.out.println("로그인 실패");
        }
        hong.logout("hong");
    }
}
