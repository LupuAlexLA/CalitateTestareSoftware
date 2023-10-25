package cinema.observer;

import java.util.ArrayList;
import java.util.List;

public class Film implements ISubject{
    private List<IObserver> observatori = new ArrayList<IObserver>();
    private String mesaj = "";
    private String numeFilm;
    public void play(String numeSala) {
        this.mesaj = "Filmul " + numeFilm + " incepe in sala " + numeSala;
        notifica();
    }
    public void stop(String numeSala) {
        this.mesaj = "In sala " + numeSala + " s-a terminat filmul " + numeFilm;
        notifica();
    }
    public Film(String nume){
        this.numeFilm = nume;
    }

    @Override
    public void adaugaObserver(IObserver o) {
        observatori.add(o);
    }

    @Override
    public void stergeObserver(IObserver o) {
        observatori.remove(o);
    }

    @Override
    public void notifica() {
        for(IObserver o : observatori)
            o.update(mesaj);
    }
}
