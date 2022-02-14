package javaApi;

public class StringEx6 {
    public static void main(String[] args) {

        String[] names = {"홍길동","김철수","이영희"};
        String[] ssn = {"700123-1111111","891032-1231233","981233-2231233"};
        String[] star = null;

        for (int i =0; i< names.length; i++) {

            System.out.println(names[i] + ssn[i].substring(0,7)+"*******");
        }
    }
}
