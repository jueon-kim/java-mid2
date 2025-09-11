package generic.ex1;

public class RowTypeMain {

    public static void main(String[] args) {

        GenericBox integerBox = new GenericBox();
//        GenericBox<Object> integerBox = new GenericBox<>() //권장


        /**
         *
         * 제네릭 타입을 사용할 때는 항상 <>를 사용해서 사용시점에 타입을 지정해야 한다. 그런데 왜 이런 로 타입을 지원하는 것일까?
         *
         * 자바의 제네릭이 자바가 처음 등장할 때 부터 있었던 것이 아니라 자바가 오랜기간 사용된 이후에 등장했기 때문에 제네
         * 릭이 없던 시절의 과거 코드와의 하위 호환이 필요했다.
         * 그래서 어쩔 수 없이 이런 로 타입을 지원한다. 정리하면 로 타입을 사용하지 않아야 한다.
         * 만약에 `Object` 타입을 사용해야 한다면 다음과 같이 타입 인자로 `Object` 를 지정해서 사용하면 된다.
         *
         *
         * 정리하면 로 타입을 사용하지 않아야 한다.
         * 만약에 `Object` 타입을 사용해야 한다면 다음과 같이 타입 인자로 `Object` 를 지정해서 사용하면 된다.
         * GenericBox<Object> integerBox = new GenericBox<>();
         */
    }
}
