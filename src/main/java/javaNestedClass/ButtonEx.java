package javaNestedClass;

public class ButtonEx {
    public static void main(String[] args) {
        Button asd = new Button();

        asd.setOnClickListener(new CallListener());
        asd.touch();
        asd.setOnClickListener(new Message());
        asd.touch();
    }
}
