package cinema.decorator;

public class TestDecorator {
    public static void main(String[] args) {
        IFilm film = new Film("Titanic");
        film.pornesteFilm();
        film.opresteFilm();

        AFilmImbunatatit filmImbunatatit = new FilmImbunatatit(film);
        filmImbunatatit.pornesteFilm();
        filmImbunatatit.pauza();
        filmImbunatatit.resume();
        filmImbunatatit.opresteFilm();
    }
}
