package asigurare.composite;

public class Angajat extends Nod{
    String nume;
    String pozitie;

    public Angajat(String nume, String pozitie) {
        this.nume = nume;
        this.pozitie = pozitie;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPozitie(String pozitie) {
        this.pozitie = pozitie;
    }

    @Override
    public String getNume() {
        return this.nume;
    }

    @Override
    public String getPost() {
        return this.pozitie;
    }
}
