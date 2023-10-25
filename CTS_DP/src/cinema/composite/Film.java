package cinema.composite;

public class Film implements INod{
    private String numeFilm;

    public Film(String numeFilm) {
        super();
        this.numeFilm = numeFilm;
    }

    @Override
    public void printeazaDescriere(String spatii) {
        System.out.println(spatii + "Filmul: " + numeFilm);
    }

    @Override
    public void adaugaNod(INod nod) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeNod(INod nod) {
        throw new UnsupportedOperationException();
    }

    @Override
    public INod getNod(int i) {
        throw new UnsupportedOperationException();
    }
}
