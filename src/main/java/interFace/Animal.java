package interFace;

/**
 * #추상클래스
 * 1.인스턴스 금지
 * 2.메소드 앞에 abstract 써서 사용
 *
 * #추상메소드
 * 1.메소드 본체가 없다.
 */
public abstract class Animal {
    String name;

    abstract void move();
    abstract void sleep();
}
