package asigurare.abstractFactory;

public class VanzatorIntern extends IAngajat{
    @Override
    public String getTip() {
        return "Vanzator Intern";
    }

    @Override
    public void afisare(String nume, String departament) {
        System.out.println("Vanzator Intern: " + nume + " in departament " + departament);
    }
}
