package javaApi;

public class StringEx2 {
    public static void main(String[] args) {
        String str = "안녕하세";
        char cValue = str.charAt(3);
        System.out.println(cValue);

        String compNum = "ss10023";

        char asd = compNum.charAt(2);
        System.out.println(asd);
        switch (asd) {
            case '1':
                System.out.println("경리부");
                break;
            case '2':
                System.out.println("영업부");
                break;
            case '3':
                System.out.println("자재부");
                break;
        }

        String ssn = "920052-2343343";

        char jender = ssn.charAt(7);

        if (jender== '1' || jender == '3') {
            System.out.println("남성입니다");
        }else if (jender == '2' || jender == '4' ) {
            System.out.println("여성입니다");
        }else {
            System.out.println("오류");
        }
    }


}
