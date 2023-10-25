package asigurare.prototype;

import java.util.ArrayList;

public abstract class ContractAsigurare implements Cloneable{
    private String id;
    protected String tip;
    protected ArrayList<Object> clauzeContractuale;
    abstract void printare();
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }

    public String getTip() {
        return tip;
    }

    public ArrayList<Object> getClauzeContractuale() {
        return clauzeContractuale;
    }

    @Override
    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    @Override
    public String toString() {
        return "ContractAsigurare{" +
                "id='" + id + '\'' +
                ", tip='" + tip + "}";
    }
}
