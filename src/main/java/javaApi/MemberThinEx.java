package javaApi;

public class MemberThinEx {
    public static void main(String[] args) {
        MemberThin original = new MemberThin("hong","홍길동","12345",45,true);
        MemberThin cloned = original.getMember();
        cloned.passsword = "11111";
        System.out.println("원본");
        System.out.println(original.id + " / " + original.name + " / "+ original.passsword + " / " + original.age + " / " + original.adult);

        System.out.println("복제");
        System.out.println(cloned.id + " / " + cloned.name + " / "+ cloned.passsword + " / " + cloned.age + " / " + cloned.adult);

    }
}
