package generic.ex;

public class BoxMain2 {

    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Object object = integerBox.get();
        Integer integer = (Integer) integerBox.get();
        System.out.println("Integer " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get();

        //잘못된 타입의 인수 전달시
//        System.out.println("문자 100");
//        Integer result = (Integer) integerBox.get();
//        System.out.println("result " + result);

        /**
         * 반환 타입이 맞지 않아 오류가 난다
         * Object 는 모두의 부모이다. Integer 은 자삭 타입이여서 Integer = Object가 성립할수 없다.
         *
         * Object 를 반환 하기 때문에 원하는 타입을 정확하게 받을수 없고 항상 위험한 다운 캐스팅을 시도 해야 한다.
         * 결과 적으로 이 방식을 타입 안전성이 떨어진다.
         *
         * BoxMain1` : 각각의 타입별로 `IntegerBox` , `StringBox` 와 같은 클래스를 모두 정의
         * 코드 재사용X
         * 타입 안전성O
         * `BoxMain2` : `ObjectBox` 를 사용해서 다형성으로 하나의 클래스만 정의
         * 코드 재사용O
         * 타입 안전성X
         *
         *
         */
    }
}
