package asigurare.simpleFactory;
public class Analist extends IAngajat{
    @Override
    public String getTip() {
        return "Analist";
    }
    @Override
    public void afisare(String nume) {
        System.out.println("Analist: " + nume);
    }
}
