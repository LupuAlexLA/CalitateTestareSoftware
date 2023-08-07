package asigurare.abstractFactory;

public abstract class IAngajat {
    private String nume;
    private String departament;

    public abstract String getTip();
    public abstract void afisare(String nume, String departament);

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }
}
