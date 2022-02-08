package exercise;

public class Member {
    public String name;
    public String id;
    public String password = null;
    public int age = 0;

    public Member(String name, String id) {
        this.name = name;
        this.id = id;
    }
    public Member(String name, String id, String password, int age) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.age = age;
    }
}
