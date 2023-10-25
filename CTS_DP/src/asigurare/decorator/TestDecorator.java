package asigurare.decorator;

public class TestDecorator {
    public static void main(String[] args) {
        AsigurareRCA asigurareRCA = new AsigurareRCA("Asigurare RCA", 520);
        AsigurareCasco asigurareCasco = new AsigurareCasco(asigurareRCA);
        AsigurareCascoFurt asigurareCascoFurt = new AsigurareCascoFurt(asigurareRCA);

        System.out.println("Asigurare RCA");
        System.out.println(asigurareRCA.getComponenteAsigurare());
        System.out.println(asigurareRCA.getCost());

        System.out.println("Asigurare Casco");
        System.out.println(asigurareCasco.getComponenteAsigurare());
        System.out.println(asigurareCasco.getCost());

        System.out.println("Asigurare Casco Furt");
        System.out.println(asigurareCascoFurt.getComponenteAsigurare());
        System.out.println(asigurareCascoFurt.getCost());
    }
}
