public class CarEx {

    public static void main (String [] args) {
        System.out.println("\n--------this()미사용---------\n");

        Car car11 = new Car();
        System.out.println("제작회사 :" + car11.company);
        System.out.println("차량모델 :" + car11.model);
        System.out.println("최고속도 :" + car11.maxSpeed);
        System.out.println();

        Car car12 = new Car("기아자동차");
        System.out.println("제작회사 :" + car12.company);
        System.out.println("차량모델 :" + car12.model);
        System.out.println("최고속도 :" + car12.maxSpeed);
        System.out.println();

        Car car13 = new Car("쌍용자동차", "토레스");
        System.out.println("제작회사 :" + car13.company);
        System.out.println("차량모델 :" + car13.model);
        System.out.println("최고속도 :" + car13.maxSpeed);
        System.out.println();

        Car car14 = new Car("쉐보레", "콜로라도", 200);
        System.out.println("제작회사 :" + car14.company);
        System.out.println("차량모델 :" + car14.model);
        System.out.println("최고속도 :" + car14.maxSpeed);
        System.out.println();

        System.out.println("\n--------this()사용---------\n");
        Car2 car15 = new Car2();
        System.out.println("제작회사 :" + car15.company);
        System.out.println("차량모델 :" + car15.model);
        System.out.println("최고속도 :" + car15.maxSpeed);
        System.out.println();

        Car2 car16 = new Car2("기아자동차");
        System.out.println("제작회사 :" + car16.company);
        System.out.println("차량모델 :" + car16.model);
        System.out.println("최고속도 :" + car16.maxSpeed);
        System.out.println();

        Car2 car17 = new Car2("쌍용자동차", "토레스");
        System.out.println("제작회사 :" + car17.company);
        System.out.println("차량모델 :" + car17.model);
        System.out.println("최고속도 :" + car17.maxSpeed);
        System.out.println();

        Car2 car18 = new Car2("쉐보레", "콜로라도", 200);
        System.out.println("제작회사 :" + car18.company);
        System.out.println("차량모델 :" + car18.model);
        System.out.println("최고속도 :" + car18.maxSpeed);
        System.out.println();

    }
}
