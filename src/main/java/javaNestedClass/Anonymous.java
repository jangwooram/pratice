package javaNestedClass;

public class Anonymous {
    Person wooram = new Person() {
        void work() {
            System.out.println("출근합니다.");
        }
        @Override
        void wake() {
            System.out.println("6시반에 일어납니다");
            work();
        }
    };

    void method1() {
        Person gildong = new Person() {

            void walk() {
                System.out.println("산책합니다");
            }

            @Override
            void wake() {
                System.out.println("9시에 일합니다.");
                walk();
            }
        };
gildong.wake();

    }
    void method2(Person person) {
        person.wake();
    }
}
