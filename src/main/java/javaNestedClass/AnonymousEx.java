package javaNestedClass;

public class AnonymousEx extends Anonymous{
    public static void main(String[] args) {
        Anonymous any = new Anonymous();
        any.wooram.wake();
        any.method1();
        any.method2(new Person(){
            void study() {
                System.out.println("java");
            }

            @Override
            void wake() {
                System.out.println("11시에 일어납니다");
                study();
            }
        });

    }
}
