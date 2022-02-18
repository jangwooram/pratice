package javaLambda;

public class FunctionInterfacEx1 {
    public static void main(String[] args) {
        FunctionInterface myfunc = (a, b) -> {
            System.out.println("인터페이스 구현");
            System.out.println(a+"*"+b+ "= "+ a*b);
            return 0;
        };

        myfunc.method1(10,20);
    }
}
