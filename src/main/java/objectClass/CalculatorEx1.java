package objectClass;

import java.util.Scanner;

public class CalculatorEx1 {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        cal.powerOn();
        int result1 = cal.add(12,43,54,654);
        System.out.println(result1);
        int val1[] = {23,34,54,65};
        System.out.println(cal.add(val1));
        /*int values1[] = {23,43,54,67};
        int addResult = cal.add(values1);
        System.out.println("더하기 결과 = " + addResult);
        int addResult2 = cal.add(new int[]{23, 43, 54, 67, 456});
        System.out.println("더하기 결과 = " + addResult2);*/
        cal.powerOff();
    }
}
