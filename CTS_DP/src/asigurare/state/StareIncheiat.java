package asigurare.state;

public class StareIncheiat implements Stare{
    @Override
    public void mesaj(String text) {
        System.out.println("S-a incheiat contractul, se trimite spre semnare " + text);
    }
}
