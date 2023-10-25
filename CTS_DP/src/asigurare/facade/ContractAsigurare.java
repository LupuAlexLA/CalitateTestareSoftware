package asigurare.facade;

public class ContractAsigurare {
    AsigurareCladire asigurareCladire;
    AsigurareDezastreNaturale asigurareDezastreNaturale;
    AsigurareParcAuto asigurareParcAuto;
    AsigurareProductie asigurareProductie;

    public ContractAsigurare(AsigurareCladire asigurareCladire,
                             AsigurareDezastreNaturale asigurareDezastreNaturale,
                             AsigurareParcAuto asigurareParcAuto,
                             AsigurareProductie asigurareProductie) {

        this.asigurareCladire = asigurareCladire;
        this.asigurareDezastreNaturale = asigurareDezastreNaturale;
        this.asigurareParcAuto = asigurareParcAuto;
        this.asigurareProductie = asigurareProductie;
    }

    public void asigurareLocuinta() {
        this.asigurareCladire.adauga();
        this.asigurareDezastreNaturale.adauga();
        System.out.println("Asigurare Locuinta adaugata");
    }

    public void asigurareFirmaProductie() {
        this.asigurareCladire.adauga();
        this.asigurareDezastreNaturale.adauga();
        this.asigurareProductie.adauga();
        System.out.println("Asigurare Firma Productie adaugata");
    }

    public void asigurareTotala() {
        this.asigurareCladire.adauga();
        this.asigurareDezastreNaturale.adauga();
        this.asigurareProductie.adauga();
        this.asigurareParcAuto.adauga();
        System.out.println("Asigurare Totala adaugata");
    }

    @Override
    public String toString() {
        return "ContractAsigurare{" +
                "asigurareCladire=" + asigurareCladire.esteInclusa +
                ", asigurareDezastreNaturale=" + asigurareDezastreNaturale.esteInclusa +
                ", asigurareParcAuto=" + asigurareParcAuto.esteInclusa +
                ", asigurareProductie=" + asigurareProductie.esteInclusa +
                '}';
    }
}


