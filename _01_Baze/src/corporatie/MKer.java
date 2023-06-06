package corporatie;

import java.util.Arrays;

public class MKer extends Firma implements IRemunerabil{
    private String numeMker;
    private int[] campanii;
    private int nrCampanii;
    private int aniExperienta;

    public MKer(String numeMker, int[] campanii, int nrCampanii, int aniExperienta) {
        this.numeMker = numeMker;
        //this.campanii = campanii; // face shallow copy
        if(campanii != null && nrCampanii > 0) {
            this.nrCampanii = nrCampanii;
            this.campanii = new int[nrCampanii];
            for(int i = 0; i < nrCampanii; i++) {
                this.campanii[i] = campanii[i];
            }
        }
        this.aniExperienta = aniExperienta;
    }

    public MKer(String numeFirma, String numeMker, int[] campanii, int aniExperienta) {
        super(numeFirma);
        this.numeMker = numeMker;
        //this.campanii = campanii; // face shallow copy
        if(campanii != null && nrCampanii > 0) {
            this.nrCampanii = nrCampanii;
            this.campanii = new int[nrCampanii];
            for(int i = 0; i < nrCampanii; i++) {
                this.campanii[i] = campanii[i];
            }
        }
        this.aniExperienta = aniExperienta;
    }

    public String getNumeMker() {
        return numeMker;
    }

    public void setNumeMker(String numeMker) {
        this.numeMker = numeMker;
    }

    public int[] getCampanii() {
        if(campanii != null) {
            int[] copy = new int[campanii.length];
            System.arraycopy(campanii, 0, copy, 0, campanii.length);
            return copy;
        } else {
            return null;
        }
    }

    public void setCampanii(int[] campanii) {
        if(campanii != null) {
            this.campanii = new int[campanii.length];
            for(int i = 0; i < campanii.length; i++) {
                this.campanii[i] = campanii[i];
            }
        }
    }

    public int getNrCampanii() {
        nrCampanii = getCampanii().length;
        return nrCampanii;
    }

    public void setNrCampanii(int nrCampanii) {
        this.nrCampanii = nrCampanii;
    }

    public int getAniExperienta() {
        return aniExperienta;
    }

    public void setAniExperienta(int aniExperienta) {
        this.aniExperienta = aniExperienta;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        MKer copy = (MKer) super.clone();
        copy.numeMker = numeMker;
        copy.nrCampanii = nrCampanii;
        copy.campanii = getCampanii(); // important sa fie get... ca sa nu faci shallow in clone()
        return copy;
    }

    @Override
    public String toString() {
        return "corporatie.MKer{" +
                "numeMker='" + numeMker + '\'' +
                ", campanii=" + Arrays.toString(campanii) +
                ", nrCampanii=" + getNrCampanii() +
                '}';
    }

    @Override
    public void lucreaza() {
        System.out.println("MKerul promoveaza, planifica si incaseaza salariu!");
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
}
