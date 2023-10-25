package cinema.state;

public class InPauza implements Stare{
    @Override
    public void actioneaza(Film film) {
        System.out.println("Filmul este in pauza");
        film.setStare(this);
    }
}
