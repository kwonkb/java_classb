public class Car2 {
    import java.lang.reflect.Type;

    public class Car2 {
        public String company;
        public String model;
        public String type;

        public Car2() {
            setInfo();
        }

        public Car2() {
            company = "현대 자동차";
            model = "투싼";
            type = "SUV";
        }

        public Car2(String c) {
            company = c;
            model = "투싼";
            type = "SUV";
        }

        public Car2(String c, String m) {
            company = c;
            model = m;
            type = "SUV";
        }

        public Car2(String c, String m, String t) {
            company = c;
            model = m;
            type = t;
        }

        public void setInfo() {
            company = "현대 자동차";
            model = "투싼";
            type = "SUV";
        }

        public void printInfo() {
            System.out.println("제조회사 :" + company);
            System.out.println("차량명 :" + model);
            System.out.println("차종 :" + type);
        }

    }

}
