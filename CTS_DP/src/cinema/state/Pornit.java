package cinema.state;

public class Pornit implements Stare{
    @Override
    public void actioneaza(Film film) {
        System.out.println("Filmul ruleaza in acest moment");
        film.setStare(this);
    }
}
