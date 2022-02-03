package objectClass;

public class GoodsStock {  // 상품재고 클래스

    String goodsCode; // 상품코드
    int stockNum; // 재고수량



    void addStock(int amount) { // 재고수량 추가
        stockNum+= amount;
    }

    int subtrackStock(int amount) {  // 재고수량 빼기
        if(stockNum<amount) {
            return 0;
        }
        stockNum-=amount;
        return amount;
    }
}
