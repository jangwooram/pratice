package javaNestedClass;

public class CallListener implements Button.OnclickListener {

    @Override
    public void onClick() {
        System.out.println("전화걸기");
    }
}
