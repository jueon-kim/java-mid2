package generic.ex1;

public class GenericBox <T> {

    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    /**
     * <>를 사용한 클래스를 제네릭 클래스라 한다 보통 다이아 몬드라 한다.
     * T를 타입 매개 변수라고 한다. 이 타입은 String, Integer으로 변환 할수 있따.
     *
     */
}
