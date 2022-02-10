package javaNestedClass;

public class NestedEx {
    public static void main(String[] args) {
        NestedA aa = new NestedA();
        NestedA.NestedB nb = aa.new NestedB();
        nb.num = 50;
        System.out.println(nb.num);
        nb.method();
    }
}
