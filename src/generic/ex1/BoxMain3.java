package generic.ex;

public class BoxMain3 {

    public static void main(String[] args) {

        GenericBox<Integer> integerBox = new GenericBox<>(); // 생성 시점의 T의 타입 결정
        integerBox.set(10);
//        integerBox.set("문자 100"); // integer 타입만 허용, 컴퍼일 오류
        Integer integer = integerBox.get(); // Integer 타입 반환 (캐스팅 X)
        System.out.println("integer " + integer);

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("str = " + str);

        //원하는 타입 모두 가능
        GenericBox<Double> newdoubleBox = new GenericBox<>();
        newdoubleBox.set(10.5);
        System.out.println("newdoubleBox = " + newdoubleBox);

        //타입 추론: 생성하는 제너릭 타입 생략가능
        // 자바 컴파일러가 타입을 추론할 수 있는 상황에만 가능하다.
        // 쉽게 이야기해 서 읽을 수 있는 타입 정보가 주변에 있어야 추론할 수 있다.
        GenericBox<IntegerBox> integerBox2 = new GenericBox<>();

        /**
         * 자바 컴파일러가 우리가 입력한 타입정보를 기반으로 이런 코드가 있다고 가정하고 컴파일 과정에 타입 정보 를 반영 한다
         * 제네릭의 핵심은 사용할 타입을 미리 결정하지 않는다.
         * 클래스 내부에서 사용하는 타입을 클래스를 정의하는
         * 시점에 결정하는 것이 아니라 실제 사용하는 생성 시점에 타입을 결정하는 것이다.
         * 이것을 쉽게 비유하자면 메서드의 매개변수와 인자의 관계와 비슷하다.
         *
         * 매개변수는(Parameter) - 인자 또는 인수를 받아서 처리 해준다.
         * 인자, 인수(Argument) - 값이 넘어 오는 것
         * 매서드의 매개변수에 인자를 전달해서 메서드의 사용 값을 결정한다.
         *
         * 재네릭의 타입 배개변수와 타입인자
         * 제네릭 앞서 설명한 메서드의 매개변수와 인자의 관계와 비슷하게 작동한다.
         * 제네릭 클래스를 정의할 때 내부에서 사용할 타입을 미리 결정 하는 것이 아니라, 해당 클래스를 실제 사용하는 생성 시점에 내부에서
         * 사용할 타입을 결정 하는 것이다. 차이가 있다면 메서드의 메서드의 매개변수는 사용할 값에 대한 결정을 나중으로
         * 미루는 것**이고, **제네릭의 타입 매개변수는 사용할 타입에 대한 결정을 나중으로 미루는 것**이다.
         *
         *
         * 정리하면..
         * 메서드는 **매개변수**에 **인자**를 전달해서 사용할 값을 결정한다.
         * 제네릭 클래스는 **타입 매개변수**에 **타입 인자**를 전달해서 사용할 타입을 결정한다.<T></T>
         *
         *
         * 제네릭에서 사용하는 용어도 매개변수, 인자의 용어를 그대로 가져다 사용한다. 다만 값이 아니라 **타입을 결정**하는 것이
         * 기 때문에 앞에 타입을 붙인다.
         * 타입 매개변수: `GenericBox<T>` 에서 `T`
         * 타입 인자:
         * `GenericBox<Integer>` 에서 `Integer`
         * `GenericBox<String>` 에서 `String`
         * 제네릭 타입의 타입 매개변수 `<T>` 에 타입 인자를 전달해서 제네릭의 사용 타입을 결정한다.
         * `GenericBox<T>`
         * `String` `GenericBox<String>`
         * `Integer` ` GenericBox<Integer>`
         *
         *
         ***용어 정리**
         * **제네릭(Generic) 단어**
         * 제네릭이라는 단어는 일반적인, 범용적인이라는 영어 단어 뜻이다.
         * 풀어보면 특정 타입에 속한 것이 아니라 일반적으로, 범용적으로 사용할 수 있다는 뜻이다.
         *
         *  **제네릭 타입 (Generic Type)**
         * 클래스나 인터페이스를 정의할 때 타입 매개변수를 사용하는 것을 말한다.
         * 제네릭 클래스, 제네릭 인터페이스를 모두 합쳐서 제네릭 타입이라 한다.
         * 타입은 클래스, 인터페이스, 기본형(`int` 등)을 모두 합쳐서 부르는 말이다.
         * 예: `class GenericBox<T> { private T t; }`
         * 여기에서 `GenericBox<T>` 를 제네릭 타입이라 한다.
         *
         * **타입 매개변수 (Type Parameter)**
         * 제네릭 타입이나 메서드에서 사용되는 변수로, 실제 타입으로 대체된다.
         * 예: `GenericBox<T>`
         * 여기에서 `T` 를 타입 매개변수라 한다.
         *
         * **타입 인자 (Type Argument)**
         * 제네릭 타입을 사용할 때 제공되는 실제 타입이다.
         * 예: `GenericBox<Integer>`
         * 여기에서 `Integer` 를 타입 인자라 한다.
         *
         * 주로 사용하는 키워드는 다음과 같다.
         * E - Element
         * K - Key
         * N - Number
         * T - Type
         * V - Value
         * S,U,V etc. - 2nd, 3rd, 4th types
         *
         * */
    }
}
