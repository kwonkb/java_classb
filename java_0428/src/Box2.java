//제네릭을 사용한 클래스, <T>는 해당 클래스 사용시 사용자가 입력하는 데이터 타입에 따라 데이터 타입이 변경됨.

public class Box2<T> {
    private T t;
    public T get() {
        return  t;
    }

    public void set(T t) {
        this.t = t;
    }
}
