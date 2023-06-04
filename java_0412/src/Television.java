public class Television {
    static String company = "삼성";
    static String model = "OLED";
    static String info;

    static {
        info = company + " - " + model;
    }

    public static void setTelevision(String company, String model) {
        Television.company= company;
        Television.model = model;

    }
}
