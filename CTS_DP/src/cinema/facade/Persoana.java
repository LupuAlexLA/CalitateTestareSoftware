package cinema.facade;

public class Persoana {
    private String nume;

    public Persoana(String nume) {
        this.nume = nume;
    }

    public void merge() {
        System.out.println(nume + " merge");
    }
}
