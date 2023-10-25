package cinema.observer;

public class Client implements IObserver{
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void update(String mesaj) {
        System.out.println(nume + " ai un mesaj: " + mesaj);
    }
}
