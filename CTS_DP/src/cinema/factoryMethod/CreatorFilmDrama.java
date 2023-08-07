package cinema.factoryMethod;

public class CreatorFilmDrama implements ICreator {
    @Override
    public IFilm createObject() {
        return new FilmDrama();
    }
}
