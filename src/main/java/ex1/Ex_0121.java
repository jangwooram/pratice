package ex1;

import java.util.Random;
import java.util.Scanner;

public class Ex_0121 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        /**
         * Byte.MIN VALUE / MAX VALUE byte의 최솟값과 최대값을 구할수 있다. ex) MIN VALUE > var < MAX VALUE 하면
         * 변수가 byte값으로 쓸 수 있는지 짤리는지 알 수 있다.
         * */

        /*int num = 3212;
        if(num > Byte.MIN_VALUE && num < Byte.MAX_VALUE) {
            System.out.println("byte 값으로 쓸 수 있습니다,");
        }
        System.out.println("byte 값으로 쓸 수 없습니다.");*/

//        doubleIf();
        // sw();
        //doubleFor();
        //forPlus();
        //animalGame();
        lastQuiz();
    }

    public static void doubleIf() {
        System.out.println("점수를 입력해주세요");
        int score = scan.nextInt();

        if (score > 100 || score < 0) {
            System.out.println("점수가 잘 못 입력되었습니다.");
        } else {
            while (score >= 0) {
                if (score > 90) {
                    System.out.println("A등급입니다.");
                    break;
                }
                if (89 > score && score >= 80) {
                    System.out.println("B등급입니다.");
                    break;
                }
                if (79 > score && score >= 70) {
                    System.out.println("C등급입니다.");
                    break;
                }
                if (69 > score && score >= 60) {
                    System.out.println("D등급입니다.");
                    break;
                }
                if (score < 60) {
                    System.out.println("F등급니다.");
                } else {
                    System.out.println("점수를 제대로 입력해주세요");
                }
                break;
            }
        }
    }

    public static void sw() {
        /**
         *  switch(변수){
         *  case 값:
         *  break;
         *
         *  default:
         *  실행문;
         *  }
         *  */

        System.out.println("여행지 입력 1.미국 2.유럽 3.동남아");
        int trip = scan.nextInt();

        switch (trip) {
            case 123:
                System.out.println("미국 여행입니다.");
                break;

            case 456:
                System.out.println("유럽 여행입니다.");
                break;

            case 789:
                System.out.println("동남아 여행입니다,");
                break;

            default:
                System.out.println("잘못 선택하셨습니다.");
                break;
        }
    }

    public static void quiz() {
        System.out.println("점수를 입력해주세요");
        int score = scan.nextInt();

        switch (score / 10) {
            case 10:
            case 9:
                System.out.println("A등급입니다.");
                break;
            case 8:
                System.out.println("B등급입니다");
                break;
            case 7:
                System.out.println("C등급입니다");
                break;
            case 6:
                System.out.println("D등급입니다");
                break;
            default:
                System.out.println("F등급입니다");
        }

    }

    public static void again() {
        /*System.out.println("출력 하고싶은 단은?");
        int gugu = scan.nextInt();
        try {
            for (int i = 1; i <= 9; i++) {
                System.out.println(gugu + "x" + i + "=" + i * gugu);
            }
        } catch (Exception e) {
            System.exit(1);
        }
        int i = 1;
        int sum = 0;
        while (i<=100) {
            sum = sum+i;
            i++;
        }
        System.out.println(sum); */

        int i = 1;
        do {
            System.out.println(i);
            i++;
        }while (i <= 10);
    }

    public static void game() {
        Random random = new Random();
        int sol = random.nextInt(100);
        System.out.println("1 ~ 100까지 중 숫자하나를 입력하세요");
        int i = 1;

        while (i<6) {
            int num = scan.nextInt();
            if(num == sol) {
                System.out.println("정답입니다.");
                break;
            }else if (num < sol) {
                System.out.println("좀 더 큰 숫자입니다.");
            }else {
                System.out.println("좀 더 작은 숫자입니다.");
            }
            if(i ==5) {
                System.out.println("기회가 없습니다.");
                break;
            }
            System.out.println((5-i) + "번의 기회가 남았습니다.");
            i++;

        }
        System.out.println("게임을 종료 합니다.");
    }

    public static void game2() {

        Random random = new Random();
        System.out.println("주사위 눈알의 최대 개수");
        int dice = scan.nextInt();

        while (true) {
            int sol = random.nextInt(dice+1);
            System.out.println(sol);
            if(sol == 6) {
                break;
            }
        }
    }

    public static void lotto() {
        Random random = new Random();

            for (int i = 0; i <= 6; i++) {
                int lottoNum = random.nextInt(46);
                System.out.println(lottoNum);
            }
    }

    public static void doubleFor() {
        for (int i = 2; i <= 9; i++){
            System.out.println(i + "단");
            for (int j = 1; j<=9; j++) {
                System.out.println(i + "x" + j + "=" + i*j);
            }
            System.out.println("\n");
        }
    }

    public static void forPlus() {
        /*int sum = 0;
        int i;
        for( i = 0; i <= 100; i++) {
            sum = sum+ i;
            if(sum > 3600) {
                break;
            }

        }
        System.out.println(sum);
        System.out.println(i);*/

        /*for (int i =0; i <=4; i++) {
            for (int j = 0; j<= 4-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
*/
        for(int i=0;i<10;i++){
            for(int j=0;j<9-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    public static void animalGame() {
        int sum;
        for(int i = 0; i < 17; i ++){
            for (int j =0; j<17; j++) {
                sum = i*4 + j*2;
                if (sum == 56 && i+j ==17) {
                    System.out.println("i = " + i + "  j = " + j);
                }
            }
        }
    }

    public static void lastQuiz() {
        int kg2 = 2;
        int kg3 = 3;
        int man = 70;
        int sum;

        for (int i=0; i<30; i++) {
            for (int j=0; j<30; j++) {
                sum = i*2 + j*3;
                if(sum ==30) {
                    System.out.println("2kg = " + i + "  3kg = " + j);
                }
            }
        }
    }
}
