package objectClass;
// 사용자 정의 예외처리
public class BlanceErr extends Exception{ // Exception을 상속 받아야함
    public BlanceErr(){} // 무조건 디폴트 생성자는 만들어야함

    public BlanceErr(String message) {
        super(message);
    }
}
