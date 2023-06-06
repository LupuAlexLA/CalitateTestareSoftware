package corporatie;

public class ITist extends Firma implements IRemunerabil{
    private String numeITist;
    private int aniExperienta;
    private Discriminator discriminator;

    public ITist(String numeITist, int aniExperienta) {
        this.numeITist = numeITist;
        this.aniExperienta = aniExperienta;
        discriminator = Discriminator.I;
    }

    public ITist(String numeFirma, String numeITist, int aniExperienta) {
        super(numeFirma);
        this.numeITist = numeITist;
        this.aniExperienta = aniExperienta;
        discriminator = Discriminator.I;
    }

    public String getNumeITist() {
        return numeITist;
    }

    public void setNumeITist(String numeITist) {
        this.numeITist = numeITist;
    }

    public int getAniExperienta() {
        return aniExperienta;
    }

    public void setAniExperienta(int aniExperienta) {
        this.aniExperienta = aniExperienta;
    }

    public Discriminator getDiscriminator() {
        return discriminator;
    }

    public void setDiscriminator(Discriminator discriminator) {
        this.discriminator = discriminator;
    }

    @Override
    public void lucreaza() {
        System.out.println("ITistul codeaza, testeaza, raporteaza patronului si incaseaza salariu!");
    }

    @Override
    public int primesteSalariu() {
        int salariu = 0;
        if(aniExperienta <= 2 && aniExperienta > 0) {
            salariu = aniExperienta * 500 + 3500;
        } else if (aniExperienta > 2 && aniExperienta <=5) {
            salariu = aniExperienta * 500 + 7500;
        } else {
            salariu = 20000;
        }
        return salariu;
    }

    @Override
    public String toString() {
        return "corporatie.ITist{" +
                "numeITist='" + numeITist + '\'' +
                ", aniExperienta=" + aniExperienta +
                ", discriminator=" + discriminator +
                '}';
    }
}
