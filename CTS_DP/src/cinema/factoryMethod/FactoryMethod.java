package cinema.factoryMethod;

public class FactoryMethod {
    private static void difuzeazaFilm(ICreator creatorFilm, String sala) {
        // metoda lucreaza cu obiecte de tipul ICreator
        // nu stim ce fel de filme sunt create prin metoda createObject
        IFilm film = creatorFilm.createObject();
        // orice tip de film creat, este redat prin apelul metodei reda()
        film.reda(sala);
    }

    public static void main(String[] args) {
        // putem apela metoda pentru orice tip de creator
        difuzeazaFilm(new CreatorFilmActiune(), "Dem Radulescu");
        difuzeazaFilm(new CreatorFilmComedie(), "Radu Beligan");
        difuzeazaFilm(new CreatorFilmDrama(), "Gheorghe Dinica");
    }
}
