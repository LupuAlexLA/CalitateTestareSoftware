package cinema.factoryMethod;

public class CreatorFilmActiune implements ICreator{
    @Override
    public IFilm createObject() {
        return new FilmActiune();
    }
}
