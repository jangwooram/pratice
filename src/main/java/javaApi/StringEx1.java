package javaApi;

public class StringEx1 {
    public static void main(String[] args) {
        byte[] b = {65,66,67,68,69};
        String str1 = new String(b);
        System.out.println(str1);
        String str2 = new String(b,1,3);
        System.out.println(str2);
    }
}
