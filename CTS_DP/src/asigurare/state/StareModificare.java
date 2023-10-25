package asigurare.state;

public class StareModificare implements Stare{
    @Override
    public void mesaj(String text) {
        System.out.println("Contractul se modifica prin " + text);
    }
}
