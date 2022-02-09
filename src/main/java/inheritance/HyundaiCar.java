package inheritance;

public class HyundaiCar {

    public static void main(String[] args) {
        Hyundai wooramCar = new Hyundai();
        for (int i=0; i<=5; i++) {
            int problem = wooramCar.run();
            if (problem != 0) {
                System.out.println(wooramCar.tires[problem].location+"를 한국타이어로 교체");
                wooramCar.tires[problem-1] = new HankookTire(wooramCar.tires[problem-1].location,15);
            }
/*
        for (int i =0; i <= 5; i++) {
            int problem = wooramCar.run();

            switch (problem) {
                case 1:
                    System.out.println("오른쪽 앞 타이어 한국타이어로 교체");
                    wooramCar.tires[1] = new HankookTire("앞오른쪽", 15);
                    break;
                case 2:
                    System.out.println("왼쪽 앞 타이어 금호타이어로 교체");
                    wooramCar.tires[2] = new KumhoTire("앞왼쪽", 15);
                    break;
                case 3:
                    System.out.println("오른쪽 뒤 타이어 한국타이어로 교체");
                    wooramCar.tires[3] = new HankookTire("뒤오른쪽", 15);
                    break;
                case 4:
                    System.out.println("왼쪽 뒤 타이어 금호타이어로 교체");
                    wooramCar.tires[4] = new KumhoTire("뒤왼쪽", 15);
                    break;
            }*/
            System.out.println("-----------------");
        }
    }

}
