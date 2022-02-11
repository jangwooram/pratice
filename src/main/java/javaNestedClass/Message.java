package javaNestedClass;

public class Message implements Button.OnclickListener {
    @Override
    public void onClick() {
        System.out.println("메세지 보냄");
    }
}
