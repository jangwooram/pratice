package pattern;

import java.util.Arrays;

public class ArraysEx {
    public static void main(String[] args) {
        //배열복사1
        int[] num1 = {40,24,3540,34,504};
        int[] num2 = Arrays.copyOf(num1,num1.length);

        //배열복사2
        int[] num3 = Arrays.copyOfRange(num1,1,3);
        for (int i : num3){
            System.out.println(i);
        }
        System.out.println("---------");
        //배열복사3
        int[] num4 = new int[num1.length];
        System.arraycopy(num1,0,num4,0,num1.length);
        for (int i : num4) {
            System.out.println(i);
        }
    }
}
