package cinema.adapter;

public class Pelicula implements IPelicula{
    private String numePelicula;

    public Pelicula(String numePelicula) {
        super();
        this.numePelicula = numePelicula;
    }

    @Override
    public void pornestePelicula() {
        System.out.println("A pornit pelicula " + numePelicula);
    }

    @Override
    public void oprestePelicula() {
        System.out.println("Pelicula " + numePelicula + " s-a terminat");
    }
}
