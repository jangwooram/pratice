package ex1;

import java.util.Scanner;

public class Ex_0128 {
    public static void main(String[] args) {
        magicBox();
    }
    public static void quiz1() {
        Week[] days = Week.values();
        for (Week day:days){
            System.out.println(day);
        }
    }
    public static void quiz2() {
        int max =0;
        int[] arr = {1,5,3,8,2};

        for (int i=0; i< arr.length; i++){
                if (arr[i] > max){
                    max = arr[i];
                }

        }
        System.out.println(max);
    }
    public static void quiz3() {
        int[][] arr = {{95,86},{83,92,96},{78,83,93,87,88}};
        int sum =0;
        double avg = 0.0;

        for (int[] ints : arr) {
            for (int j = 0; j < ints.length; j++) {
                sum = sum + ints[j];
            }
            avg = avg + ints.length;
        }

        System.out.println("총합은 = "+sum);
        System.out.println("평균은 = "+sum/avg);
        //System.out.println("평균은 = "+);
    }
    public static void quiz4() {
        boolean run = true;
        int stuNum =0;
        int[] score = null;

        Scanner scan = new Scanner(System.in);

        while (run) {
            System.out.println("---------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("---------------------------------------------");
            System.out.print("선택 >");

            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("학생 수>");
                    stuNum = scan.nextInt();
                    score = new int[stuNum];
                    break;
                case 2:
                    for(int i=0; i<stuNum; i++) {
                        System.out.print("score[" + i + "]>");
                        score[i] = scan.nextInt();
                    }
                    break;
                case 3:
                    for(int i=0; i< score.length; i++) {
                        System.out.println("score["+ i +"]: " + score[i]);
                    }
                    break;
                case 4:
                    int lastScore=0;
                    int total = 0;
                    double avg = 0.0;

                    for (int i =0; i< score.length; i++) {
                        for (int j = i+1; j< score.length; j++){
                            if(score[i] > lastScore){
                                lastScore = score[i];
                            }
                        }
                        total+=score[i];
                        avg = score.length;
                    }
                    System.out.println(total);
                    System.out.println("최고 점수는 = "+ lastScore);
                    System.out.println("평균 = "+ total/avg);
                    break;
                case 5:
                    System.out.println("프로그램 종료");
                    run = false;
                    break;
                default:
                    System.out.println("잘못 선택 하셨습니다.");
            }

            /*if(choice ==1 ){
                System.out.print("학생 수>");
                stuNum = scan.nextInt();
                score = new int[stuNum];
            }
            if(choice ==2) {
                for(int i=0; i<stuNum; i++) {
                    System.out.print("score[" + i + "]>");
                    score[i] = scan.nextInt();
                }
            }
            if(choice==3) {
                for(int i=0; i< score.length; i++) {
                    System.out.println("score["+ i +"]: " + score[i]);
                }
            }
            if(choice==4) {
                int lastScore=0;
                int total = 0;
                double avg = 0.0;

                for (int i =0; i< score.length-1; i++) {
                        if(score[i]>lastScore){
                            lastScore = score[i];
                    }
                    total += score[i];
                    avg = score.length;
                }
                System.out.println("최고 점수는 = "+ lastScore);
                System.out.println("평균 = "+ total/avg);
            }
            if (choice ==5) {
                System.out.println("프로그램 종료");
                run= false;
            }*/
        }
    }
    public static void magicBox() {
        int [][] mabang= new int[3][3];
        int row, col;
        int number =1;

        row=0;
        col=mabang[0].length/2;
        mabang[row][col] = number;
        for (number=2; number<= mabang.length* mabang[0].length; number++){
            row--;
            col++;
            if(row<0 && col==mabang.length){
                row+=2;
                col--;
            }
            if (row<0) {
                row = mabang.length-1;
            }
            if (col == mabang.length) {
                col =0;
            }
            if (mabang[row][col]!=0) {
                row+=2;
                col--;
            }
            mabang[row][col] = number;
        }


        for (int i=0; i<mabang.length; i++) {
            for (int j=0; j<mabang[i].length; j++){
                System.out.print(mabang[i][j]+ " ");
            }
            System.out.println();

        }

    }
}
