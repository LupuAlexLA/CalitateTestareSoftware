package asigurare.observer;

public class BrokerAsigurari implements Observator{
    @Override
    public void procesare() {
        System.out.println("Apelare persoana contact");
    }
}
