package interFace;

public class IanimalEx1 {
    public static void main(String[] args) {
        Icat cat = new Icat();
        cat.eat();

        Itiger tiger = new Itiger();
        tiger.move();
        tiger.eat();
        tiger.sleep();
    }
}
