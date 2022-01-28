package ex1;

import java.util.Calendar;

public class Ex_0127 {
    public static void main(String[] args) {
        enumEx();
    }

    public static void selectionSort() {
        //sort 알고리즘  = selection sort 방식
        int[] nums = {43, 40, 32, 21, 19};
        int wait;
        for (int a = 0; a < nums.length - 1; a++) {
            for (int b = a + 1; b < nums.length; b++) {
                if (nums[a] < nums[b]) {
                    wait = nums[a];
                    nums[a] = nums[b];
                    nums[b] = wait;
                }
            }
        }

        System.out.println("정렬된 자료 출력");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "  ");
        }
    }

    public static void bubbleSort() {
        int[] nums = {43, 40, 32, 21, 19};

        int wait;
        for (int a = 0; a < nums.length - 1; a++) {
            for (int b = 0; b < nums.length - 1 - a; b++) {
                if (nums[b] > nums[b + 1]) {
                    wait = nums[b];
                    nums[b] = nums[b + 1];
                    nums[b + 1] = wait;
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void quiz1() {
        int score[] = {75, 96, 63, 88, 70};
        String[] name = {"홍길동", "이영희", "김철수", "이동국", "박찬호"};
        int temp;
        String named;

        for (int a = 0; a < score.length - 1; a++) {
            for (int b = a + 1; b < score.length; b++) {
                if (score[a] < score[b]) {
                    //점수순서
                    temp = score[a];
                    score[a] = score[b];
                    score[b] = temp;

                    //이름순서
                    named = name[a];
                    name[a] = name[b];
                    name[b] = named;
                }
            }
        }
        System.out.println("**시험 성적표**");
        for (int i = 0; i < score.length; i++) {
            System.out.println((i + 1) + "등 " + name[i] + " : " + score[i] + "점");
        }
    }

    public static void arrEx3() {
        //int [] [] score = new int[2][3];
        int[][] score = {{20, 30, 10}, {45, 70, 50}};
        for (int i = 0; i < score.length; i++) {
            System.out.println("..." + score[0].length);
            System.out.println("..." + score[1].length);

            for (int j = 0; j < score[i].length; j++) {
                System.out.print("(" + score[i][j] + ")");
            }
            System.out.println();
        }
    }

    public static void test() {
        int score[][] = {{1, 2, 3, 4}, {5, 6, 7}, {8, 9, 10}};

        System.out.println(score.length);
        System.out.println(score[1].length);
        System.out.println(score[2].length);

    }

    public static void arrCopy() {

        //배열 복사하기
        int[] oldArr = {10, 20, 30};
        int[] newArr = new int[5];

        //System.arraycopy(복사할 배열, 복사할 배열 시작위치, 복사 받을 배열, 새로운 배열의 시작위치, 복사할 배열의 크기);
        System.arraycopy(oldArr, 0, newArr, 0, oldArr.length);
        //복사한 값
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
        /*
        for (int i =0; i < oldArr.length; i++) {
            newArr[i] = oldArr[i];
        }
        for (int i =0; i < oldArr.length; i++) {
            System.out.println(newArr[i]);
            System.out.println(oldArr[i]);
        }
        */
    }

    public static void levelUpFor() {
        //향상된 포문은 배열에서 사용함
        int total = 0;
        int[] score = {85, 96, 74, 90, 62};

        for (int sc : score) {
            total += sc;
        }
        System.out.println("총점 = " + total);
        System.out.println("평균 = " + (double) total / score.length);
    }

    public static void enumEx() {
        Week today = null;
        Calendar cal = Calendar.getInstance();
        int to = cal.get(Calendar.DAY_OF_WEEK);
        switch (to) {
            case 1:
                today=Week.sunday;
                break;
            case 2:
                today=Week.monday;
                break;
            case 3:
                today=Week.tuesday;
                break;
            case 4:
                today=Week.wednesday;
                break;
            case 5:
                today=Week.thursday;
                break;
            case 6:
                today=Week.friday;
                break;
            case 7:
                today=Week.saturday;
                break;
        }
        if(to == 1 || to ==7) {
            System.out.println(today);
            System.out.println("쉬셈");
        }else {
            System.out.println(today);
            System.out.println("공부하셈");
        }
    }
}