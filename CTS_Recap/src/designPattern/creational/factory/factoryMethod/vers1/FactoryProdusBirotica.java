package designPattern.creational.factory.factoryMethod.vers1;

import java.util.Date;
import java.util.List;
public class FactoryProdusBirotica implements IFactory{
    @Override
    public IProdus creareProdus(String denumire, Date dataExpirare, List<Float> listaPreturi) {
        return new ProdusBirotica(denumire,dataExpirare,listaPreturi,20);
    }
}
