public class Tranzactie {
    private int cantitate;

    public Tranzactie(int cantitate) {
        this.cantitate = cantitate;
    }

    public int getCantitate() {
        return cantitate;
    }

    @Override
    public String toString() {
        return "Tranzactie{" +
                "cantitate=" + cantitate +
                '}';
    }
}
