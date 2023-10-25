package asigurare.memento;

public class Contract {
    private String clauzeContractuale;
    private float procent;
    private String numeClient;

    public Contract(String numeClient) {
        this.numeClient = numeClient;
    }

    public void adaugaClauzeContractuale(String clauze) {
        this.clauzeContractuale += "\n" + clauze;
    }

    public VersiuneContract salvare() {
        System.out.println("Salvare versiune contract");
        return new VersiuneContract(this.clauzeContractuale, this.procent);
    }

    public void refacereVersiuneContractAnterior(VersiuneContract versiuneContract) {
        this.clauzeContractuale = versiuneContract.getClauzeContractuale();
        this.procent = versiuneContract.getProcent();
    }

    @Override
    public String toString() {
        return "Contract{" +
                "clauzeContractuale='" + clauzeContractuale + '\'' +
                ", numeClient='" + numeClient + '\'' +
                '}';
    }
}
