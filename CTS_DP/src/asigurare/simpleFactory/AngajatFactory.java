package asigurare.simpleFactory;

public class AngajatFactory {
    public IAngajat creareAngajat(TipAngajat tipAngajat, String nume) {
        IAngajat angajat = null;

        switch (tipAngajat) {
            case VANZATOR:
                angajat = new Vanzator();
                angajat.setNume(nume);
                break;
            case MANAGER:
                angajat = new Manager();
                angajat.setNume(nume);
                break;
            case ANALIST:
                angajat = new Analist();
                angajat.setNume(nume);
                break;
        }

        return angajat;
    }
}
