package asigurare.simpleFactory;

public abstract class IAngajat {
    private String nume;

    public abstract String getTip();
    public abstract void afisare(String nume);

    public void setNume(String nume) {
        this.nume = nume;
    }
}
