package corporatie;

public abstract class Firma implements Cloneable {
    private String numeFirma;

    public Firma() {
        numeFirma = "";
    }

    public Firma(String numeFirma) {
        this.numeFirma = numeFirma;
    }

    public String getNumeFirma() {
        return numeFirma;
    }

    public void setNumeFirma(String numeFirma) {
        this.numeFirma = numeFirma;
    }

    public abstract void lucreaza();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Firma copy = (Firma) super.clone();
        copy.numeFirma = numeFirma;
        return copy;
    }
}
