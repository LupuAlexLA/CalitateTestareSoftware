package designPattern.creational.factory.factoryMethod.vers1;

import java.util.Date;
import java.util.List;

public class ProdusAlimentar extends Produs {
    private int cantitate;
    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }
    public ProdusAlimentar(String denumire, Date dataExpirare, List<Float> listaPreturi, int cantitate) {
        super(denumire, dataExpirare, listaPreturi);
        this.cantitate=cantitate;
    }
    @Override
    public void afisareDescriere() {
        super.afisareDescriere();
        System.out.println("Produsul are cantitatea: "+cantitate);
    }
}
