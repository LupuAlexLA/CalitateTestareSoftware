package cinema.state;

public class Oprit implements Stare{
    @Override
    public void actioneaza(Film film) {
        System.out.println("Filmul s-a terminat");
        film.setStare(this);
    }
}
