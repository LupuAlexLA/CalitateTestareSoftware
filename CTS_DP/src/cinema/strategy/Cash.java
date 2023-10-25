package cinema.strategy;

public class Cash implements ModPlata{
    @Override
    public void plateste(String nume, double suma) {
        System.out.println("Clientul " + nume + " a platit cash suma " + suma);
    }
}
