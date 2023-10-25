package asigurare.memento;

public class VersiuneContract {
    private String clauzeContractuale;
    private float procent;

    public VersiuneContract() {
        clauzeContractuale = "";
        procent = 0;
    }

    public VersiuneContract(String clauzeContractuale, float procent) {
        this.clauzeContractuale = clauzeContractuale;
        this.procent = procent;
    }

    public String getClauzeContractuale() {
        return clauzeContractuale;
    }

    public float getProcent() {
        return procent;
    }
}
