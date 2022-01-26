package ex1;

import java.util.Arrays;
import java.util.Random;

public class arrEx {
    public static void main(String[] args) {
        quiz3();
    }

    public static void ex1() {
        int arr[] = {90, 80, 70, 88, 50};
        int sum = 0;
        int[] nums = new int[5];
        System.out.println(nums[3]);
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("총점은= " + sum);
        System.out.println("평균은= " + sum / arr.length);
    }

    public static void quiz1() {
        int score[] = {78, 96, 60, 86, 73};
        int sum = 0;
        double lastScore;
        for (int i = 0; i < score.length; i++) {
            sum = sum + score[i];
        }
        lastScore = (double) sum / score.length;
        System.out.println("총점은= " + sum);
        System.out.println("평균은= " + lastScore);

    }

    public static void quiz2() {
        int[] score = {35, 45, 62, 80, 16, 32, 71};
        int jnum = 0;
        int hnum = 0;
        for (int i = 0; i < score.length; i++) {

            if (score[i] % 2 == 0) {
                jnum += score[i];
            } else {
                hnum += score[i];
            }

        }
        System.out.println("짝수합은 " + jnum);
        System.out.println("홀수합은 " + hnum);
    }

    public static void lotto() {
        Random random = new Random();
        int lottoNum[] = new int[6]; //6칸짜리 배열을 만듦
        boolean run = true; // while문을 계속 돌리기 위해 true 변수 만듦
        while (run) { //계속 반복
            for (int i = 0; i < lottoNum.length; i++) { //0부터 배열 칸 만큼 반복
                lottoNum[i] = random.nextInt(45) + 1; // 배열 i번째에 랜덤 숫자를 만들어서 넣기
            }
            run = false; //while문 탈출
            Outter:  // break 나오는 위치
            for (int a = 0; a < lottoNum.length-1; a++) { //배열 칸 만큼 반복   ,length-1 은 마지막 6번째 자리는 비교할 필요가 없어서임
                for (int b = a + 1; b < lottoNum.length; b++) { // 바깥 for문보다 +1해서 증가
                    if (lottoNum[a] == lottoNum[b]) { // a번째와 b번째 배열 안에 숫자가 같은지 비교
                        run = true; // 중복 숫자가 있다면 while문 다시 반복
                        break Outter; // Outter는 숫자 비교중 중복이 생기면 탈출 하라는거, 그래야 속도 향상됨
                    }
                }
            }
        }

        for (int i =0; i< lottoNum.length; i++) {
            System.out.println(lottoNum[i]);
        }
    }

    public static void quiz3() {
        int[] ages = {35,23,65,42,29,24,23,23,36,29,15};
        int[] sales = {23000,75000,65000,30000,74000,12000,96000,10000,36000,45000,8000};
        int sum = 0;
        for (int i =0; i < ages.length; i++) {

                if(ages[i] <30 && ages[i]>19) {
                    sum += sales[i];
                }
        }
        System.out.println(sum);
    }
}
