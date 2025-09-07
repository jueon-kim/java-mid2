package generic.test.ex4;

public class MethodMain1 {

    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);

        Integer result = GenericMethod.<Integer>genericMethod(i);
        Integer integerValue = GenericMethod.<Integer>numberMethod(10);
        Double doubleValue = GenericMethod.<Double>numberMethod(10.5);

        System.out.println("타입 추론");
        Integer result2 = GenericMethod.genericMethod(i);
        Integer integerValue2 = GenericMethod.numberMethod(10);
        Double doubleValue2 = GenericMethod.numberMethod(20.0);
    }
    /**
     * **제네릭 타입**
     * 정의: `GenericClass<T>`
     * 타입 인자 전달: 객체를 생성하는 시점
     * 예) `new GenericClass<String>`
     * **제네릭 메서드**
     * 정의: `<T> T genericMethod(T t)`
     * 타입 인자 전달: 메서드를 호출하는 시점
     * 예) `GenericMethod.<Integer>genericMethod(i)`
     *
     * 제네릭 메서드는 클래스 전체가 아니라 특정 메서드 단위로 제네릭을 도입할 때 사용한다.
     * 제네릭 메서드를 정의할 때는 메서드의 반환 타입 왼쪽에 다이아몬드를 사용해서 `<T>` 와 같이 타입 매개변수를
     * 적어준다.
     * 제네릭 메서드는 메서드를 실제 호출하는 시점에 다이아몬드를 사용해서 `<Integer>` 와 같이 타입을 정하고 호
     * 출한다.
     * 제네릭 메서드의 핵심은 메서드를 호출하는 시점에 타입 인자를 전달해서 타입을 지정하는 것이다. 따라서 타입을 지정
     * 하면서 메서드를 호출한다.
     *
     */
}
