public class PersonEx {
    public static void main (String [] args) {
        Person p1 = new Person("1234567-1234567", "유재석");
        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);

//        p1.nation = "USA";
//        p1.nation = "567890-567890";
        p1.name = "유병재";

        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);
    }
}
