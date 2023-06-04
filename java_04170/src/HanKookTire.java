public class HanKookTire extends Tire{
public HanKookTire (String position, int maxRotation){
    super(position, maxRotation);
}
// 부모 클래스인 Tire 클래스으 멤버 roll() 메소드를 상속받아
@Override
    public boolean roll() {
    ++accRotation;

    if(accRotation < maxRotation) {
        System.out.println(position + "HanKookTire 수명 : " + (maxRotation - accRotation) + "회");
        return true;
    }
    else {
        System.out.println("***" + position + "HanKookTire 펑크 ***");
        return false;
    }
}
}
