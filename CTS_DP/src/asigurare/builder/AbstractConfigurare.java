package asigurare.builder;

public abstract class AbstractConfigurare {
    public abstract void adaugaAsigurareAuto(IAsigurareAuto asigurareAuto);
    public abstract void adaugaAsigurareProductie(IAsigurareProductie asigurareProductie);
    public abstract void adaugaAsigurareServicii(IAsigurareServicii asigurareServicii);

    public abstract ContractAsigurare getContract();
}
