package javaApi;

public class MemberThin implements Cloneable{
    public String id;
    public String name;
    public String passsword;
    public int age;
    public boolean adult;

    public MemberThin(String id, String name, String passsword, int age, boolean adult) {
        this.id = id;
        this.name = name;
        this.passsword = passsword;
        this.age = age;
        this.adult = adult;
    }

    public MemberThin getMember() {
        MemberThin cloned = null;
        try {
            cloned = (MemberThin) clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }

        return cloned;
    }
}
