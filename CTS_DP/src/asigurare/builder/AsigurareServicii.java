package asigurare.builder;

public class AsigurareServicii implements IAsigurareServicii{
    int nrContracte;

    public AsigurareServicii(int nrContracte) {
        this.nrContracte = nrContracte;
    }

    public int getNrContracte() {
        return nrContracte;
    }

    public void setNrContracte(int nrContracte) {
        this.nrContracte = nrContracte;
    }
}
