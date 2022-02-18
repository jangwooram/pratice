package javaGeneric;

public class ChildProductEx1 {
    public static void main(String[] args) {
        ChildProduct<Tv,String,String> product1 =new ChildProduct<>();
        product1.setCompany("sanmsung");
        product1.setKind(new Tv());
        product1.setModel("smart Tv");


    }
}
