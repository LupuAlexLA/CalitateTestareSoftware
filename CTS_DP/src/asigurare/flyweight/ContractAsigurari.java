package asigurare.flyweight;

public class ContractAsigurari implements IContract{
    private String tipContract;
    private String numeClient;
    private String dateClient;

    public ContractAsigurari(String tipContract) {
        this.tipContract = tipContract;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public void setDateClient(String dateClient) {
        this.dateClient = dateClient;
    }

    public String getTipContract() {
        return tipContract;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public String getDateClient() {
        return dateClient;
    }

    @Override
    public void printeaza() {
        System.out.println("Se printeaza contract asigurare: " + this.tipContract +
                " pentru clientul: " + this.numeClient);
    }
}
