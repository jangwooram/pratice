package javaGeneric;

public class ProductEx {
    public static void main(String[] args) {
        Product<Tv, String> product1 = new Product<Tv, String>();
        product1.setKind(new Tv());
        product1.setModel("삼성스마트티비");

        Tv tv = product1.getKind();
        String tvModel = product1.getModel();

        Product<Audio, String> product2 = new Product<>();
        product2.setKind(new Audio());
        product2.setModel("엘지오디오");

        Audio audio = product2.getKind();
        String audioModel = product2.getModel();

    }
}
