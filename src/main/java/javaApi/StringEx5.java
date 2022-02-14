package javaApi;

public class StringEx5 {
    public static void main(String[] args) {
        String oldStr = "korea 화이팅!! korea 만세!!";
        String newStr = oldStr.replace("korea","대한민국");

        System.out.println(oldStr);
        System.out.println(newStr);

        String str = "computer";
        String subStr1 = str.substring(3);
        System.out.println(subStr1);
    }
}
