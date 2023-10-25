package cinema.state;

public class Film {
    private Stare stare;

    public Film() {
        stare = new Pregatit();
    }

    public Stare getStare() {
        return stare;
    }

    public void setStare(Stare stare) {
        this.stare = stare;
    }
}
