package javaApi;

public class MemberDeepEx {
    public static void main(String[] args) {
        MemberDeep original = new MemberDeep("김철수",28,
                new int[] {90,70,88}, new Car("소나타"));

        MemberDeep cloned = original.getMember();
        cloned.score[1] = 75;
        cloned.car.model= "그랜저";

        System.out.println("원본" + original.name + " / " + original.age + " / ");
        for (int i =0; i< original.score.length; i++) {
            System.out.println("점수 " + original.score[i]);
        }

        System.out.println("원본" + cloned.name + " / " + cloned.age + " / ");
        for (int i =0; i< cloned.score.length; i++) {
            System.out.println("점수 " + cloned.score[i]);
        }
    }
}
