package cinema.adapter;

public class Film implements IFilm{
    private String numeFilm;

    public Film(String numeFilm) {
        super();
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
}
