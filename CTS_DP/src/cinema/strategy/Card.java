package cinema.strategy;

public class Card implements ModPlata{
    @Override
    public void plateste(String nume, double suma) {
        System.out.println("Clientul " + nume + " a platit cu cardul suma " + suma);
    }
}
