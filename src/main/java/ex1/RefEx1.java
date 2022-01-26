package ex1;

public class RefEx1 {
    public static void main(String[] args) {
            String strValue1 = "홍길동";
            String strValue2 = "홍길동";

            if(strValue1==strValue2){
                System.out.println("참조가 같음");
            }else {
                System.out.println("다름");
            }if(strValue1.equals(strValue2)){
            System.out.println("문자열 같음");

            String strValue3 = new String("홍길동");
            String strValue4 = new String("홍길동");

            if(strValue3==strValue4){
                System.out.println("참조가 같음");
            }else {
                System.out.println("다름");
            }if(strValue3.equals(strValue4)){
                System.out.println("문자열 같음");
        }
    }
}
}
