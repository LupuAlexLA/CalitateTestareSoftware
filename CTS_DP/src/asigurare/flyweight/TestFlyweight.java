package asigurare.flyweight;

public class TestFlyweight {
    private static final String tipuriContracte[] = {"RCA", "Casco", "Cargo", "CMR", "Medical"};

    public static void main(String[] args) {
        ContracteFlyweightFactory contracteDePrintat = new ContracteFlyweightFactory();

        for (int i = 0; i <= 30; i++) {
            ContractAsigurari contract = contracteDePrintat.getContract(getTipContractAleator());
            contract.setDateClient("Adresa " + i);
            contract.setNumeClient("Client " + i);
            contract.printeaza();
        }

        System.out.println("\nS-au printat " + contracteDePrintat.getNumarContractePrintate() + " documente de tip contracte");
        System.out.println("S-au creat " + contracteDePrintat.getNumarMatriteContracte() + " matrite pentru printat contracte");
    }

    private static String getTipContractAleator() {
        return tipuriContracte[(int)(Math.random()*tipuriContracte.length)];
    }
}
