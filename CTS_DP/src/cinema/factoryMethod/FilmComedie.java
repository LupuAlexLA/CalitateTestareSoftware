package cinema.factoryMethod;

public class FilmComedie implements IFilm {
    @Override
    public void reda(String sala) {
        System.out.println("In sala" + sala + " este un film de comedie");
    }
}
