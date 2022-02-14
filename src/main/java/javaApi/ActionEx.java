package javaApi;

import java.util.Scanner;

public class ActionEx {
    public static void main(String[] args) {

        try {
            Class class1 = null;
            Scanner scan = new Scanner(System.in);
            System.out.println("1.보냄 2.받음");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    class1 = Class.forName("javaApi.SendAction");
                    break;
                case 2:
                    class1 = Class.forName("javaApi.ReceiveAction");
                    break;
            }
            Action action = (Action) class1.newInstance();
            action.execute();
        } catch (ClassNotFoundException e) {
            System.out.println("해당 클래스가 없습니다");
        } catch (InstantiationException e) {
            System.out.println("추상 클래스입니다.");
        } catch (IllegalAccessException e) {
            System.out.println("접근할 수 없습니다.");
        }
    }
}
