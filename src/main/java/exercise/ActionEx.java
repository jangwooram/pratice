package exercise;

public class ActionEx {
    public static void main(String[] args) {
        Action action = () -> System.out.println("복사를 합니다.");
        action.work();
        }
}
