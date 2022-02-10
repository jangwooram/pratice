package javaNestedClass;

public class NestedStaticA {
    static class NestedStaticB {
        int num1;
        static int num2;

        public  NestedStaticB() {

        }

        void me() {
            System.out.println("aaaa");
        }
        static void nn() {
            System.out.println("wwww");
        }
    }
}
