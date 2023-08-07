package asigurare.abstractFactory;

public class AngajatInternFactory extends AbstractAngajatFactory{
    @Override
    protected IAngajat creareAngajat(TipAngajat tipAngajat) {
        IAngajat angajat = null;

        switch (tipAngajat) {
            case VANZATOR:
                angajat = new VanzatorIntern();
                angajat.setDepartament("vanzari");
                break;
            case MANAGER:
                angajat = new Manager();
                angajat.setDepartament("management");
                break;
            case ANALIST:
                angajat = new AnalistIntern();
                angajat.setDepartament("analiza");
                break;
        }
        return angajat;
    }
}
