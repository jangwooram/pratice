package exercise;

public class ShopService {

    private static ShopService shopService = new ShopService();

    public static ShopService getInstance() {
        return shopService;
    };
}
