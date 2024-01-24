package designPattern.creational.factory.factoryMethod.vers1;

import java.util.Date;
import java.util.List;

public class ProdusBirotica extends Produs {
    private int lungime;
    public ProdusBirotica(String denumire, Date dataExpirare, List<Float> listaPreturi, int lungime) {
        super(denumire, dataExpirare, listaPreturi);
        this.lungime=lungime;
    }
    @Override
    public void afisareDescriere() {
        super.afisareDescriere();
        System.out.println("Produsul are lungimea: "+lungime);
    }

}
