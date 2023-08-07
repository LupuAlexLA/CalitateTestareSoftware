package asigurare.abstractFactory;

public class AnalistIntern extends IAngajat {
    @Override
    public String getTip() {
        return "Analist Intern";
    }

    @Override
    public void afisare(String nume, String departament) {
        System.out.println("Analist Extern: " + nume + " in departament " + departament);
    }
}
