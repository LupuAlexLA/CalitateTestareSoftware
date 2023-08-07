package asigurare.abstractFactory;

public class Manager extends IAngajat{
    @Override
    public String getTip() {
        return "Manager";
    }

    @Override
    public void afisare(String nume, String departament) {
        System.out.println("Manager: " + nume + " in departament " + departament);
    }
}
