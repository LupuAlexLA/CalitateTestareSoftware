package cinema.flyweight;

public class Film implements IFilm{
    private String denumire;

    public Film(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void play(Sala sala) {
        System.out.println(denumire + " a inceput in sala " + sala.getNumarSala());
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }
}
