package javaLambda;

public class ClassLambdaEx {
    public static void main(String[] args) {
        ClassLambda clambda = new ClassLambda();
        ClassLambda.InnerClass innerClass = clambda.new InnerClass();

        innerClass.method1();

    }
}
