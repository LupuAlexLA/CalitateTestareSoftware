package asigurare.abstractFactory;

public class TestAbstractFactory {
    public static void main(String[] args) {
        // creare factory angajati interni
        AbstractAngajatFactory angajatiFactory = new AngajatInternFactory();

        // creare angajati interni
        IAngajat angajat1 = angajatiFactory.creareAngajat(TipAngajat.VANZATOR);
        IAngajat angajat2 = angajatiFactory.creareAngajat(TipAngajat.MANAGER);
        IAngajat angajat3 = angajatiFactory.creareAngajat(TipAngajat.ANALIST);

        System.out.println("Angajati interni:");
        System.out.println("Tip angajat1: " + angajat1.getTip());
        System.out.println("Tip angajat2: " + angajat2.getTip());
        System.out.println("Tip angajat3: " + angajat3.getTip());

        // modificare generator angajati externi
        angajatiFactory = new AngajatExternFactory();

        // creare angajat extern
        IAngajat angajat4 = angajatiFactory.creareAngajat(TipAngajat.ANALIST);

        System.out.println("\nAngajati externi:");
        System.out.println("Tip angajat4: " + angajat4.getTip());
    }
}
