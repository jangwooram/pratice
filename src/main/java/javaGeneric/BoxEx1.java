package javaGeneric;

public class BoxEx1 {
    public static void main(String[] args) {
        Box<String> box =new Box<String>();

        box.set("대한민국");
        String str = box.get();
        Box<Apple> box1 = new Box<Apple>();
        box1.set(new Apple());
        Apple apple = box1.get();
        Box<Integer>box2 = new Box<Integer>();
        box2.set(500);
        int num =box2.get();
    }
}
