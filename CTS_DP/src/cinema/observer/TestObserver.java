package cinema.observer;

public class TestObserver {
    public static void main(String[] args) {
        Client c1 = new Client("Popescu");
        Client c2 = new Client("Vasile");

        Film film = new Film("Ursul");
        film.adaugaObserver(c1);
        film.play("Sergiu Nicolaescu");
        film.adaugaObserver(c2);
        film.play("Dem Radulescu");
        film.stergeObserver(c1);
        film.stop("Dem Radulescu");
    }
}
