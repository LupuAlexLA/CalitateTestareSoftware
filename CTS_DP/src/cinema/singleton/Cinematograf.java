package cinema.singleton;

public class Cinematograf {
    private String nume;
    private String adresa;
    private int nr_sali;
    private static Cinematograf instanta = null;

    private Cinematograf(int nr_sali) {
        nume = "LightCinema";
        adresa = "Romania";
        this.nr_sali = nr_sali;
    }

    public static Cinematograf getInstance(int nr_sali) {
        if(instanta == null) {
            instanta = new Cinematograf(nr_sali);
        }
        return instanta;
    }

    @Override
    public String toString() {
        return "Cinematograf [nume=" + nume + ", adresa=" + adresa + ", nr_sali=" + nr_sali + "]";
    }
}
