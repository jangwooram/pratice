package objectClass;

public class GoodsStockEx1 {
    public static void main(String[] args) {
        GoodsStock ballpen = new GoodsStock();
        GoodsStock note = new GoodsStock();
        int amount;

        ballpen.goodsCode = "JKbp010223";
        note.goodsCode = "JKnt12353";
        ballpen.stockNum= 100;
        note.stockNum= 500;
        ballpen.addStock(500);
        note.addStock(400);

        amount = ballpen.subtrackStock(150);
        System.out.println("출고 수량 " + amount);
        System.out.println("재고 수량 " + ballpen.stockNum);
        System.out.println("=============");
        System.out.println("노트 제품코드 " + note.goodsCode);
        System.out.println("노트 재고수량 " + note.stockNum);


    }
}
