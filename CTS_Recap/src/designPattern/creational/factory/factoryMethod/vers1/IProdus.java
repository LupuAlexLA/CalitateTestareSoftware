package designPattern.creational.factory.factoryMethod.vers1;

import java.util.Date;
import java.util.List;

public interface IProdus {
    abstract Date getValabilitate();

    abstract void afisareDescriere();

    abstract List<Float> afisareIstoricPreturi(int nrLuni);
}
