package cinema.state;

public class TestState {
    public static void main(String[] args) {
        Film film = new Film();

        Stare pregatit = new Pregatit();
        pregatit.actioneaza(film);

        Stare pornit = new Pornit();
        pornit.actioneaza(film);

        Stare inPauza = new InPauza();
        inPauza.actioneaza(film);

        Stare oprit = new Oprit();
        oprit.actioneaza(film);
    }
}
