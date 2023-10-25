package asigurare.builder;

public class AsigurareAutoRCA implements IAsigurareAuto{
    int nrMasini;

    public AsigurareAutoRCA(int nrMasini) {
        this.nrMasini = nrMasini;
    }

    public int getNrMasini() {
        return nrMasini;
    }

    public void setNrMasini(int nrMasini) {
        this.nrMasini = nrMasini;
    }
}
