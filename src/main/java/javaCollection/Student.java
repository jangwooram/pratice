package javaCollection;

public class Student {
    public int sno; //학번
    public String name;

    public Student(int sno, String name) {
        this.sno=sno;
        this.name=name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student student = (Student) obj;
            return (sno == student.sno && name.equals(student.name));
        }else {
            return false;
        }
    }
    public void aa() {
        System.out.println(name.hashCode());
    }
    @Override
    public int hashCode() {
        return sno + name.hashCode();
    }
}
