package cinema.strategy;

public class OrdinPlata implements ModPlata{
    @Override
    public void plateste(String nume, double suma) {
        System.out.println("Clientul " + nume + " a platit prin ordin de plata suma " + suma);
    }
}
