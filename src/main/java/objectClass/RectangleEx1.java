package objectClass;

public class RectangleEx1 {
    public static void main(String[] args) {
        int result;
        Rectangle sq = null;
        try {
            sq = new Rectangle(10, 20);
            sq.setWidth(30);
            result = sq.getArea();
            System.out.println(sq.getWidth());
            System.out.println(sq.getHeight());
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }
}
