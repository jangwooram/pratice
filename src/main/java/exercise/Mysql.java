package exercise;

public class Mysql implements DataAccObj{

    @Override
    public String select() {
        return "sql 디비에서 검색";
    }

    @Override
    public String insert() {
        return "sql 디비에서 입력";
    }

    @Override
    public String update() {
        return "sql 디비에서 갱신";
    }

    @Override
    public String delete() {
        return "sql 디비에서 삭제";
    }
}
