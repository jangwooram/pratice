package exercise;

public class ShopServiceEx {
    public static void main(String[] args) {

        ShopService shop1 = ShopService.getInstance();
        ShopService shop2 = ShopService.getInstance();

        if (shop1 == shop2) {
            System.out.println("같음");
        }else {
            System.out.println("다름");
        }

    }

}
