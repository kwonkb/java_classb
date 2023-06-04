import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<Coin> coinBox = new Stack<>();

        coinBox.push(new Coin(100));
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(500));
        coinBox.push(new Coin(10));

        while (!coinBox.isEmpty()) {
//              스택에 저장된 데이터를 가장 마지막에 저장한 것부터 출력
            Coin coin = coinBox.pop();
            System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
        }
    }
}
