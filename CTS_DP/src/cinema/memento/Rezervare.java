package cinema.memento;

public class Rezervare {
    private int nr_locuri;

    public int getNr_locuri() {
        return nr_locuri;
    }

    public void setNr_locuri(int nr_locuri) {
        this.nr_locuri = nr_locuri;
    }

    public RezervareMemento saveStateToMemento() {
        return new RezervareMemento(this.nr_locuri);
    }

    public void getStateFromMemento(RezervareMemento memento) {
        this.nr_locuri = memento.getNr_locuri();
    }
}
