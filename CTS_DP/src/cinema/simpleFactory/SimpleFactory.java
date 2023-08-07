package cinema.simpleFactory;

public class SimpleFactory {
    public static void main(String[] args) {
        BiletFactory fabrica = new BiletFactory();
        Bilet bilet;

        bilet = fabrica.createInstance(TipBilet.Student);
        bilet.descriere();

        bilet = fabrica.createInstance(TipBilet.VIP);
        bilet.descriere();

        bilet = fabrica.createInstance(TipBilet.Adult);
        bilet.descriere();
    }
}
