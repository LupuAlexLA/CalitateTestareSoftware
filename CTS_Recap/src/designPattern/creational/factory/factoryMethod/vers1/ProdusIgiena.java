package designPattern.creational.factory.factoryMethod.vers1;

import java.util.Date;
import java.util.List;

public class ProdusIgiena extends Produs {
    public boolean isTransmisibil;
    public ProdusIgiena(String denumire, Date dataExpirare, List<Float> listaPreturi, boolean isTransmisibil) {
        super(denumire, dataExpirare, listaPreturi);
        this.isTransmisibil=isTransmisibil;
    }
    @Override
    public void afisareDescriere() {
        super.afisareDescriere();
        if (isTransmisibil) {
            System.out.println("Produsul este transmisibil");
        } else {
            System.out.println("Produsul nu este transmisibil");
        }
    }
}
