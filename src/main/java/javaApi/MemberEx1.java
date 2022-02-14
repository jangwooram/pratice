package javaApi;

public class MemberEx1 {
    public static void main(String[] args) {
        Member member1 = new Member("kbs");
        Member member2 = new Member("kbs");
        Member member3 = new Member("mbc");

        if (member1.equals(member2)) {
            System.out.println("same");
        }else {
            System.out.println("diff");
        }
        if (member3.equals(member1)) {
            System.out.println("same");
        }else {
            System.out.println("diff");
        }
    }
}
