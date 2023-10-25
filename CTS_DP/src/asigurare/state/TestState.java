package asigurare.state;

public class TestState {
    public static void main(String[] args) {
        ContractAsigurari contract = new ContractAsigurari();
        contract.mesaj("Parc auto format din 100 de camioane. De gasit oferta pentru asigurare RCA.");

        contract.setStare(Stari.MODIFICARE);
        contract.mesaj("De adaugat o oferta si pentru asigurarea transportului de marfa");

        contract.setStare(Stari.INCHEIAT);
        contract.mesaj("Date Director: Costel Mandalache");
    }
}
