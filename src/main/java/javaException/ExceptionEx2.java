package javaException;

public class ExceptionEx2 {
    public static void main(String[] args) {
        try {
            int nums[] = {10,20,30};
            System.out.println(nums[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 범위 벗어남");
        }


    }
}
