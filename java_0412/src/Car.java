public class Car {
    String company;
    String model;
    int maxSpeed;

    public Car() {
        this.company = "현대자동차";
        this.model = "그렌저";
        this.maxSpeed = 250;
    }
    public Car(String company) {
        this.company = company;
        this.model = "그렌저";
        this.maxSpeed = 250;
    }

    public Car(String company, String model) {
        this.company = company;
        this.model = model;
        this.maxSpeed = 250;
    }

    public Car(String company, String model, int maxSpeed) {
        this.company = company;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

}
