package cinema.simpleFactory;

public class BiletStudent implements Bilet{
    @Override
    public void descriere() {
        System.out.println("Bilet pentru un Student");
    }
}
