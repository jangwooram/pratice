package javaGeneric;

public class UtilEx {
    public static void main(String[] args) {
        Box<Integer> box1 = Util.<Integer>boxing(100);
        int value = box1.get();

        Box<String> box2 = Util.boxing("idontknow");
        String str = box2.get();
    }
}
