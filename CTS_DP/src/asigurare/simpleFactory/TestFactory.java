package asigurare.simpleFactory;

public class TestFactory {
    public static void main(String[] args) {
        // creare Factory pentru angajati
        AngajatFactory factory = new AngajatFactory();

        // creare angajat de tip vanzator
        IAngajat angajat1 = factory.creareAngajat(TipAngajat.VANZATOR, "Popescu Cornel");

        // creare angajat de tip manager
        IAngajat angajat2 = factory.creareAngajat(TipAngajat.MANAGER, "Voivozeanu Alin");

        // creare angajat de tip vanzator
        IAngajat angajat3 = factory.creareAngajat(TipAngajat.ANALIST, "Ionescu Maria");

        System.out.println("Angajat de tip: " + angajat1.getTip());
        System.out.println("Angajat de tip: " + angajat2.getTip());
        System.out.println("Angajat de tip: " + angajat3.getTip());
    }
}
