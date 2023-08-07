package cinema.factoryMethod;

public class CreatorFilmComedie implements ICreator {
    @Override
    public IFilm createObject() {
        return new FilmComedie();
    }
}
