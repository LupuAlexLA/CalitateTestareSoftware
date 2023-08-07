package asigurare.abstractFactory;

public class AngajatExternFactory extends AbstractAngajatFactory{
    @Override
    protected IAngajat creareAngajat(TipAngajat tipAngajat) {
        IAngajat angajat = null;

        switch (tipAngajat) {
            case ANALIST:
                angajat = new AnalistExtern();
                angajat.setDepartament("extern");
                break;
        }
        return angajat;
    }
}
