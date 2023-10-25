package asigurare.prototype;

import java.util.ArrayList;

public class AsigurareAuto extends ContractAsigurare{
    public AsigurareAuto() {
        System.out.println("Incarcare contract asigurare auto");
        clauzeContractuale = new ArrayList<>(2);
        this.tip = "Asigurare Auto";
    }
    @Override
    void printare() {
        System.out.println("Contract de tip " + this.tip);
    }
}
