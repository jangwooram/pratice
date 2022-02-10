package exercise;

public class DaoExam {

    public static void dawork(DataAccObj dao) {
        System.out.println(dao.select());
        System.out.println(dao.insert());
        System.out.println(dao.update());
        System.out.println(dao.delete());
    }

    public static void main(String[] args) {
        dawork(new Oracle());
        dawork(new Mysql());
    }
}
