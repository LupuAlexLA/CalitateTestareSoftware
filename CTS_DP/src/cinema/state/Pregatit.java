package cinema.state;

public class Pregatit implements Stare{
    @Override
    public void actioneaza(Film film) {
        System.out.println("Filmul este gata de difuzare");
        film.setStare(this);
    }
}
