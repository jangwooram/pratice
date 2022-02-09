package inheritance;

public class AbstarctEx {
    public static void main(String[] args) {
        Tiger hodol = new Tiger();
        Eagle youngsu = new Eagle();
        hodol.name = "호돌";
        hodol.age=2;
        hodol.move();
        System.out.println(hodol.name);
        System.out.println(hodol.age);

        youngsu.name = "용수";
        youngsu.home = "둥지";
        youngsu.move();
        System.out.println(youngsu.name);
        System.out.println(youngsu.home);
    }
}
