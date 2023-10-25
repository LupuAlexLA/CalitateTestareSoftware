package asigurare.builder;

public class AsigurareProductie implements IAsigurareProductie{
    double suprafataProductie;

    public AsigurareProductie(double suprafataProductie) {
        this.suprafataProductie = suprafataProductie;
    }

    public double getSuprafataProductie() {
        return suprafataProductie;
    }

    public void setSuprafataProductie(double suprafataProductie) {
        this.suprafataProductie = suprafataProductie;
    }
}
