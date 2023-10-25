package cinema.facade;

public class Film {
    private String denumire;

    public Film(String denumire) {
        this.denumire = denumire;
        System.out.println("A fost selectat filmul: " + denumire);
    }

    public void play() {
        System.out.println(denumire + " a inceput");
    }

    public void stop() {
        System.out.println(denumire + " s-a terminat");
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }
}
