package designPattern.creational.factory.factoryMethod.vers1;

import java.util.Date;
import java.util.List;

public interface IFactory {
    IProdus creareProdus(String denumire, Date dataExpirare, List<Float> listaPreturi);
}
