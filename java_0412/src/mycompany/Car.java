package mycompany;

//hyundai 패키지 아래 있는 Engine 클래스를 현재 파일에 포함해서 사용함.
import hankook.SnowTire;
import hankook.Tire; // 자주 사용하는 클래스를 import로 등록
import hyundai.Engine;
import kumho.BigWidthTire;
//이미 동일한 클래스가 import로 등록 되어있어 동일한 이름의 클래스를 import 할 수 없음.
//import kumho.Tire; //클래스를 꼭 사용하고자할 경우 패키지명.클래스명 형태로 사용해야함.

public class Car {
    Engine engine = new Engine();
    SnowTire tire1 = new SnowTire();
    BigWidthTire tire2 = new BigWidthTire();
    Tire tire3 = new Tire();
    kumho.Tire tire4 = new kumho.Tire();
}
