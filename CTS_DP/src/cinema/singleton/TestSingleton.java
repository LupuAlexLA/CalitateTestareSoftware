package cinema.singleton;
public class TestSingleton {
    public static void main(String[] args) {
        Cinematograf f1 = Cinematograf.getInstance(3);
        Cinematograf f2 = Cinematograf.getInstance(6);

        System.out.println(f1.toString());
        System.out.println(f2.toString());
    }
}
