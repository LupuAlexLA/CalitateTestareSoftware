package asigurare.adapterObiecte;

public class Contract {
    private String numeFirma;
    private int nrMasini;
    private int[] costAchizitie;

    public Contract(String numeFirma, int nrMasini, int[] costAchizitie) {
        this.numeFirma = numeFirma;
        this.nrMasini = nrMasini;
        this.costAchizitie = costAchizitie;
    }

    public String getNumeFirma() {
        return numeFirma;
    }

    public int getNrMasini() {
        return nrMasini;
    }

    public int[] getCostAchizitie() {
        return costAchizitie;
    }
}
