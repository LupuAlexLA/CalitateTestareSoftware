package asigurare.state;

public class StareNegociere implements Stare{
    @Override
    public void mesaj(String text) {
        System.out.println("Se negociaza contractul avand structura initiala " + text);
    }
}
