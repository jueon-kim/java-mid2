package collection.list;

public class BatchProcessMain {

    public static void main(String[] args) {
//        MyArrayList<Integer> list = new MyArrayList<>();
        MyLinkedList<Integer> list = new MyLinkedList<>();
        BatchProcessor processor = new BatchProcessor(list);
        processor.logic(50_000);

        /**
         * **컴파일 타임(compile time)**: 코드 컴파일 시점을 뜻한다.
         * **런타임(runtime)**: 프로그램 실행 시점을 뜻한다.
         *
         *
         * 컴파일 타임 의존관계는 자바 컴파일러가 보는 의존관계이다. 클래스에 모든 의존관계가 다 나타난다.
         * 쉽게 이야기해서 클래스에 바로 보이는 의존관계이다. 그리고 실행하지 않은 소스 코드에 정적으로 나타나는 의존
         * 관계이다.
         * `BatchProcessor` 클래스를 보면 `MyList` 인터페이스만 사용한다. 코드 어디에도 `MyArrayList` 나
         * `MyLinkedList` 같은 정보는 보이지 않는다. 따라서 `BatchProcessor` 는 `MyList` 인터페이스에만 의존한
         * 다.
         */
    }
}
