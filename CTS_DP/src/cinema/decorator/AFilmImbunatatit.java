package cinema.decorator;

public abstract class AFilmImbunatatit implements IFilm{
    private IFilm film;

    public IFilm getFilm() {
        return film;
    }

    public void setFilm(IFilm film) {
        this.film = film;
    }

    public AFilmImbunatatit(IFilm film) {
        this.film = film;
    }

    @Override
    public void pornesteFilm() {
        film.pornesteFilm();
    }

    @Override
    public void opresteFilm() {
        film.opresteFilm();
    }

    @Override
    public String getNumeFilm() {
        return film.getNumeFilm();
    }

    // cele doua metode noi
    public abstract void pauza();
    public abstract void resume();
}
