package objectClass;

public class PhysicalInfoEx1 {
    public static void main(String[] args) {
        PhysicalInfo yh = new PhysicalInfo("영희", 10, 135.0f, 37.0f);

        printPhysicalInfo(yh);

        yh.update(11, 145.3f, 48.0f);
        printPhysicalInfo(yh);

        yh.update(12, 150.3f);
        printPhysicalInfo(yh);

        yh.update(13);
        printPhysicalInfo(yh);
    }
    static void printPhysicalInfo(PhysicalInfo obj) {
        System.out.println("이름 : " + obj.name);
        System.out.println("나이 : " + obj.age);
        System.out.println("키 : " + obj.height);
        System.out.println("몸무게 : " + obj.weight);
        System.out.println("================");
    }
}
