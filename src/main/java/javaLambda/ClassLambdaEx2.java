package javaLambda;

public class ClassLambdaEx2 {
    public static void main(String[] args) {
        ClassLambda2 classLambda2 = new ClassLambda2();
        ClassLambda2.InnerClass innerClass1 = classLambda2.new InnerClass();

        innerClass1.method1();
    }
}
