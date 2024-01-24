package designPattern.creational.factory.factoryMethod.vers1;

import java.util.Date;
import java.util.List;
public class FactoryProdusAlimentar implements IFactory {
    @Override
    public IProdus creareProdus(String denumire, Date dataExpirare, List<Float> listaPreturi) {
        return new ProdusAlimentar(denumire,dataExpirare,listaPreturi,100);
    }
}
