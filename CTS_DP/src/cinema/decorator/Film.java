package cinema.decorator;

public class Film implements IFilm{
    private String numeFilm;

    public Film(String numeFilm) {
        this.numeFilm = numeFilm;
    }

    public void setNumeFilm(String numeFilm) {
        this.numeFilm = numeFilm;
    }

    @Override
    public void pornesteFilm() {
        System.out.println("A pornit filmul " + numeFilm);
    }

    @Override
    public void opresteFilm() {
        System.out.println("Filmul " + numeFilm + " s-a terminat");
    }

    @Override
    public String getNumeFilm() {
        return numeFilm;
    }
}
