package pattern;

public class WrapperEx1 {
    public static void main(String[] args) {

        //boxing(객체타입)
        Integer intAge1 = new Integer(50);
        Integer intAge2 = new Integer("50");
        Integer intAge3 = Integer.valueOf("200");

        //unboxing(객체타입->기본타입)
        int value1 = intAge1.intValue();
        int value2 = intAge2.intValue();
        int value3 = intAge3.intValue();

        Integer intAge4 = new Integer(500);
        int num=intAge4;

    }
}
