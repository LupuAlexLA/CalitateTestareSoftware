package cinema.adapter;

public class PeliculaAdaptata extends Pelicula implements IFilm{
    public PeliculaAdaptata(String numePelicula) {
        super(numePelicula);
    }
    @Override
    public void pornesteFilm() {
        super.pornestePelicula();
    }

    @Override
    public void opresteFilm() {
        super.oprestePelicula();
    }
}
