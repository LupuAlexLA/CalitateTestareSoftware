package cinema.observer;

public interface ISubject {
    public void adaugaObserver(IObserver o);
    public void stergeObserver(IObserver o);
    public void notifica();
}
