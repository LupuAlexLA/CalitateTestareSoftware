import java.util.ArrayList;
import java.util.List;

public class Produs {
    private int cod;
    private String denumire;
    private double pret;
    private final List<Tranzactie> tranzactii;

    public Produs(int cod, String denumire, double pret) {
        this.cod = cod;
        this.denumire = denumire;
        this.pret = pret;
        tranzactii = new ArrayList<>();
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public List<Tranzactie> getTranzactii() {
        return tranzactii;
    }

    public double getValoareStoc() {
        int cantitateCurenta = 0;
        for (var tranzactie : tranzactii) {
            cantitateCurenta += tranzactie.getCantitate();
        }
        return cantitateCurenta * getPret();
    }

    @Override
    public String toString() {
        return "Produs{" +
                "cod=" + cod +
                ", denumire='" + denumire + '\'' +
                ", pret=" + pret +
                '}';
    }
}
