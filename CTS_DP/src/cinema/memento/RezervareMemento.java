package cinema.memento;

public class RezervareMemento {
    private int nr_locuri;

    public RezervareMemento(int nr_locuri) {
        this.nr_locuri = nr_locuri;
    }

    public int getNr_locuri() {
        return nr_locuri;
    }
}
