package exercise;

public class MemberService {

    boolean login(String id, String pw) {
        if(id.equals("hong") && pw == "12345") {
            return true;
        }
        return false;
    }
    void logout(String id) {
        if (id.equals("hong")) {
            System.out.println("로그아웃 되었습니다.");
        }
    }
}
