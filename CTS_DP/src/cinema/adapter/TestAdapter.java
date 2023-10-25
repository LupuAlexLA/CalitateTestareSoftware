package cinema.adapter;

public class TestAdapter {
    private static void ruleazaFilm(IFilm film) {
        film.pornesteFilm();
        film.opresteFilm();
    }

    public static void main(String[] args) {
        IFilm film = new Film("Ursul");
        IFilm pelicula = new PeliculaAdaptata("Apele tac");

        ruleazaFilm(film);
        ruleazaFilm(pelicula);
    }
}
