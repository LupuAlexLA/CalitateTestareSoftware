package asigurare.abstractFactory;

public class AnalistExtern extends IAngajat {
    @Override
    public String getTip() {
        return "Analist Extern";
    }

    @Override
    public void afisare(String nume, String departament) {
        System.out.println("Analist Extern: " + nume + " in departament " + departament);
    }
}
