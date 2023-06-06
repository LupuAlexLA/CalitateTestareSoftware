package corporatie;

public class Patron extends Firma {
    private String numePatron;
    private int profitDorit;
    private Discriminator discriminator;

    public Patron() {
        numePatron = "";
        profitDorit = 0;
        discriminator = Discriminator.P;
    }

    public Patron(String numePatron, int profitDorit) {
        this.numePatron = numePatron;
        this.profitDorit = profitDorit;
        discriminator = Discriminator.P;
    }

    public Patron(String numeFirma, String numePatron, int profitDorit) {
        super(numeFirma);
        this.numePatron = numePatron;
        this.profitDorit = profitDorit;
        discriminator = Discriminator.P;
    }

    public String getNumePatron() {
        return numePatron;
    }

    public void setNumePatron(String numePatron) {
        this.numePatron = numePatron;
    }

    public int getProfitDorit() {
        return profitDorit;
    }

    public void setProfitDorit(int profitDorit) {
        this.profitDorit = profitDorit;
    }

    public Discriminator getDiscriminator() {
        return discriminator;
    }

    public void setDiscriminator(Discriminator discriminator) {
        this.discriminator = discriminator;
    }

    @Override
    public void lucreaza() {
        System.out.println("Patronul planifica, masoara, plateste salarii si incaseaza profit!");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Patron copy = (Patron) super.clone();
        copy.numePatron = numePatron;
        copy.profitDorit = profitDorit;
        return copy;
    }

    @Override
    public String toString() {
        return "corporatie.Patron{" +
                "numePatron='" + numePatron + '\'' +
                ", profitDorit=" + profitDorit +
                '}';
    }

    public void platesteSalarii() {
        System.out.println("Patronul " + numePatron + " a platit salariile angajatiilor!");
    }

    public void incaseazaProfit() {
        System.out.println("Patronul " + numePatron + " a incasat profit!");
    }
}
