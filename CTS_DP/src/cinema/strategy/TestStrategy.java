package cinema.strategy;

public class TestStrategy {
    public static void main(String[] args) {
        ModPlata cash = new Cash();
        ModPlata card = new Card();
        ModPlata op = new OrdinPlata();

        Client client = new Client("Popescu Ion", cash);
        client.plateste(20);

        client.setModPlata(card);
        client.plateste(100);

        client.setModPlata(op);
        client.plateste(1000);
    }
}
