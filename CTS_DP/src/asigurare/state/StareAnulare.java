package asigurare.state;

public class StareAnulare implements Stare{
    @Override
    public void mesaj(String text) {
        System.out.println("Contract anulat din motive " + text);
    }
}
