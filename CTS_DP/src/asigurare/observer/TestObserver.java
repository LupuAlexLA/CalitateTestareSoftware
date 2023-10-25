package asigurare.observer;

public class TestObserver {
    public static void main(String[] args) {
        //eveniment mediatizabil
        Eveniment eveniment = new Eveniment();

        //observatori
        BrokerAsigurari brokerAsigurari1 = new BrokerAsigurari();
        BrokerAsigurari brokerAsigurari2 = new BrokerAsigurari();
        Manager manager = new Manager();

        //abonare observatori la evenimente Media
        eveniment.adaugareObservator(brokerAsigurari1);
        eveniment.adaugareObservator(brokerAsigurari2);
        eveniment.adaugareObservator(manager);

        //lansare eveniment in Media
        eveniment.anuntMedia();
    }
}
