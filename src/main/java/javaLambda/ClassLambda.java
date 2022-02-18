package javaLambda;

public class ClassLambda {
    public int age=25;
     class InnerClass {
         int date = 18;

         void method1() {
             FunctionInterface myfunc = new FunctionInterface() {
                 @Override
                 public int method1(int amount, int price) {
                     System.out.println("고객 나이 = " + age);
                     System.out.println("출고 날짜 = " + date);
                     int result = amount * price;
                     return result;
                 }
             };
             int mae = myfunc.method1(7,2000);
             System.out.println("총 매출 = " + mae);
         }
     }
}
