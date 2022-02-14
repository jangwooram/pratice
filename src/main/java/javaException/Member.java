package javaException;

public class Member {
    public static void main(String[] args) {

        try {
            login("dwawa","12345");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            login("blue","wxqdwq");
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void login(String id, String pw) throws IdException, PwException{
        if (!id.equals("blue")){
            throw new IdException("아이디 다름");
        }
        if (!pw.equals("12345")){
            throw new PwException("비밀번호가 다름");
        }
    }
}
