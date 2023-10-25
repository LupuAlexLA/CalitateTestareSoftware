package cinema.prototype;
public class PersoanaSimulare implements IPersoanaSimulare{
    private String nume;
    private int varsta;
    private String cnp;
    public PersoanaSimulare() {
        this.nume = "Popescu Ion";
        this.varsta = 33;
        this.cnp = "1000000000000";
    }
    public PersoanaSimulare(String nume, int varsta, String cnp) {
        this.nume = nume;
        this.varsta = varsta;
        this.cnp = cnp;
    }
    @Override
    public String toString() {
        return "PersoanaSimulare{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", cnp='" + cnp + '\'' +
                '}';
    }
    @Override
    public IPersoanaSimulare duplica() {
        try {
            return (IPersoanaSimulare) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
