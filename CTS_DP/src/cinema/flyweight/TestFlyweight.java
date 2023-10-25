package cinema.flyweight;

public class TestFlyweight {
    public static void main(String[] args) {
        FabricaDeFilme fabrica = new FabricaDeFilme();
        Sala sala1 = new Sala(1);
        Sala sala2 = new Sala(2);
        Sala sala3 = new Sala(3);
        Sala sala4 = new Sala(4);

        fabrica.getFilm("How to train your dragon").play(sala1);
        fabrica.getFilm("How to train your dragon").play(sala2);
        System.out.println("In lista exista: " + fabrica.dimensiuneListaFilme() + " filme");

        fabrica.getFilm("Ursul").play(sala3);
        fabrica.getFilm("Ursul").play(sala4);
        System.out.println("In lista exista: " + fabrica.dimensiuneListaFilme() + " filme");
    }
}
