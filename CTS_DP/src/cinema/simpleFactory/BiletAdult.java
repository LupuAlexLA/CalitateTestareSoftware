package cinema.simpleFactory;

public class BiletAdult implements Bilet{
    @Override
    public void descriere() {
        System.out.println("Bilet pentru un Adult");
    }
}
