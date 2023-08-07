package asigurare.abstractFactory;

public abstract class AbstractAngajatFactory {
    protected abstract IAngajat creareAngajat(TipAngajat tipAngajat);

    public IAngajat newAngajat(TipAngajat tipAngajat, String nume) {
        IAngajat angajat = creareAngajat(tipAngajat);
        if (angajat != null) {
            angajat.setNume(nume);
        }
        return angajat;
    }
}
