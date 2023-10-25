package asigurare.facade;

public class TestFacade {
    public static void main(String[] args) {
        // fara Facade
        System.out.println("Fara Facade");

        AsigurareCladire asigurareCladire = new AsigurareCladire();
        AsigurareDezastreNaturale asigurareDezastreNaturale = new AsigurareDezastreNaturale();
        AsigurareParcAuto asigurareParcAuto = new AsigurareParcAuto();
        AsigurareProductie asigurareProductie = new AsigurareProductie();

        asigurareCladire.adauga();
        asigurareDezastreNaturale.adauga();

        // cu Facade
        System.out.println("\nUtilizand Facade");

        ContractAsigurare contractAsigurare = new ContractAsigurare(new AsigurareCladire(),
                new AsigurareDezastreNaturale(), new AsigurareParcAuto(), new AsigurareProductie());

        contractAsigurare.asigurareLocuinta();
        System.out.println(contractAsigurare);
    }
}
