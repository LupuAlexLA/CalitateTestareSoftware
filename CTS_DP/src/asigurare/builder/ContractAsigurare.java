package asigurare.builder;

public class ContractAsigurare {
    String numeClient;

    IAsigurareAuto asigurareAuto;
    IAsigurareProductie asigurareProductie;
    IAsigurareServicii asigurareServicii;

    public ContractAsigurare() {
    }

    public ContractAsigurare(String numeClient,
                             IAsigurareAuto asigurareAuto,
                             IAsigurareProductie asigurareProductie,
                             IAsigurareServicii asigurareServicii) {
        this.numeClient = numeClient;
        this.asigurareAuto = asigurareAuto;
        this.asigurareProductie = asigurareProductie;
        this.asigurareServicii = asigurareServicii;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public IAsigurareAuto getAsigurareAuto() {
        return asigurareAuto;
    }

    public void setAsigurareAuto(IAsigurareAuto asigurareAuto) {
        this.asigurareAuto = asigurareAuto;
    }

    public IAsigurareProductie getAsigurareProductie() {
        return asigurareProductie;
    }

    public void setAsigurareProductie(IAsigurareProductie asigurareProductie) {
        this.asigurareProductie = asigurareProductie;
    }

    public IAsigurareServicii getAsigurareServicii() {
        return asigurareServicii;
    }

    public void setAsigurareServicii(IAsigurareServicii asigurareServicii) {
        this.asigurareServicii = asigurareServicii;
    }
}
