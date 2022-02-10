package exercise;

public class Oracle implements DataAccObj{
    @Override
    public String select() {
        return "오라클 디비에서 검색";
    }

    @Override
    public String insert() {
        return "오라클 디비에서 입력";
    }

    @Override
    public String update() {
        return "오라클 디비에서 갱신";
    }

    @Override
    public String delete() {
        return "오라클 디비에서 삭제";
    }
}
