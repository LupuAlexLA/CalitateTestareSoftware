package cinema.strategy;

public class Client {
    private String nume;
    private ModPlata modPlata;

    public Client(String nume, ModPlata modPlata) {
        this.nume = nume;
        this.modPlata = modPlata;
    }

    public ModPlata getModPlata() {
        return modPlata;
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public String getNume() {
        return nume;
    }

    public void plateste(double suma) {
        modPlata.plateste(nume, suma);
    }
}
