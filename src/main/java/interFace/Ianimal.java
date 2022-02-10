package interFace;

/**
 * #인터페이스
 * 1.class 키워드 대신에 interface 키워드를 사용해 정의
 * 2.내부에서 추상메소드(내용이없는)를 선언해서 갖고있다.
 * 3.class에서 interface를 받아서 완성할때 implements(구현) 키워드를 사용
 * *자바는 다중 상속을 지원하지 않지만, interface를 사용하여 다중상속과 비슷하게 작성하여 활용할 수 있다.
 */
public interface Ianimal {

    //추상 메소드  = abstract
     void eat();
     void sleep();
}
