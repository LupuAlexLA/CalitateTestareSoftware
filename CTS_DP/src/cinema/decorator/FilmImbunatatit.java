package cinema.decorator;

public class FilmImbunatatit extends AFilmImbunatatit{
    public FilmImbunatatit(IFilm film) {
        super(film);
    }

    @Override
    public void pauza() {
        System.out.println("Filmul " + super.getNumeFilm() + " a intrat in pauza");
    }

    @Override
    public void resume() {
        System.out.println("Filmul " + super.getNumeFilm() + " a reinceput");
    }
}
