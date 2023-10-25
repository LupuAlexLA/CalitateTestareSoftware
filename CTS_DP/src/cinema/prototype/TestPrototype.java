package cinema.prototype;

public class TestPrototype {
    public static void main(String[] args) {
        IPersoanaSimulare p = new PersoanaSimulare("Ionescu Vasile", 28, "188901223111231");

        IPersoanaSimulare p1 = p.duplica();
        IPersoanaSimulare p2 = p.duplica();
        IPersoanaSimulare p3 = p.duplica();
        IPersoanaSimulare p4 = p.duplica();

        System.out.println(p.toString());
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
