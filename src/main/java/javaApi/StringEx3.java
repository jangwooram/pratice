package javaApi;

public class StringEx3 {
    public static void main(String[] args) {

        String str = "오늘 날씨 좋아요 굳!!";
        int pos = str.indexOf("날씨");
        System.out.println(pos);

        if (pos != -1) {
            System.out.println("날씨 관련 문자열.");
        } else {
            System.out.println("날씨랑 관련 없음");
        }

        System.out.println(str.length());
    }
}
