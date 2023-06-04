public class Car2 {
    String company;
    String model;
    int maxSpeed;

    public Car2() {
        this("현대자동차");
    }
    public Car2(String company) {
        this(company, "그렌저");
    }
    public Car2(String company, String model) {
        this(company, model, 250);
    }
    public Car2(String company, String model, int maxSpeed) {
        this.company = company;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
}
