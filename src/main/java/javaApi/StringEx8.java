package javaApi;

public class StringEx8 {
    public static void main(String[] args) {
        String str = "   안녕 ";
        String str2 = str.trim();
        System.out.println(str.length());
        System.out.println(str2.length());

        String str3 = String.valueOf(10);
        String str4 = String.valueOf(40);

        System.out.println(str3+str4);

        String text = "홍길동,김철수  #이영희  %박찬호&이동국";
        String names[] = text.trim().split(",|#|%|&");  // | 파이프 라인은 구분자 여러개 사용할때
        for (String i: names){
            System.out.println(i);
        }
        System.out.println(names[2]);
    }
}
