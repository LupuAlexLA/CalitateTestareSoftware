package cinema.facade;

public class Cinema {
    private Sala sala;
    private Film film;
    private Public publicul;

    public Cinema() {
    }

    public void difuzareFilmInSala(String numeSala, String numeFilm) {
        sala = new Sala(numeSala);
        publicul = new Public(3);
        film = new Film(numeFilm);
        sala.deschideUsa();
        sala.aprindeLumina();
        publicul.publiculIntraInSala();
        sala.inchideUsa();
        sala.stingeLumina();
        film.play();
    }
}
