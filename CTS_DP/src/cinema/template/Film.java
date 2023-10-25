package cinema.template;

public class Film extends ASpectacol{
    @Override
    public void inchideUsaSala() {
        System.out.println("Se inchide usa de la sala");
    }

    @Override
    public void stingereLuminaSala() {
        System.out.println("Se stinge lumina in sala");
    }

    @Override
    public void pornireSpectacol() {
        System.out.println("A inceput filmul");
    }
}
