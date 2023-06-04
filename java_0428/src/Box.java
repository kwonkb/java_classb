// 제네릭을 사용하지 않은 클래스
public class Box {
    private Object obj;
    public void set(Object obj) {
        this.obj = obj;
    }

    public Object get(){
        return obj;
    }
}
