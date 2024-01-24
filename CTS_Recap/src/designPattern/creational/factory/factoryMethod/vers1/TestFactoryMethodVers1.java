package designPattern.creational.factory.factoryMethod.vers1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestFactoryMethodVers1 {
    public static void main(String[] args) {

        List<Float> listaPreturi = new ArrayList<>();
        listaPreturi.add(20.0f);
        listaPreturi.add(40.0f);
        listaPreturi.add(60.0f);

        List<Float> listaPreturi2 = new ArrayList<>();
        listaPreturi.add(20.0f);
        listaPreturi.add(25.0f);
        listaPreturi.add(35.0f);

        List<Float> listaPreturi3 = new ArrayList<>();
        listaPreturi.add(40.0f);
        listaPreturi.add(60.0f);
        listaPreturi.add(80.0f);

        IFactory factory = null;
        factory = new FactoryProdusAlimentar();

        IProdus produsAlimentar = null;
        produsAlimentar = factory.creareProdus("lapte", new Date(2023, 04, 5), listaPreturi);

        IFactory factory2 = null;
        factory2 = new FactoryProdusAlimentar();

        IProdus produsAlimentar2 = null;
        produsAlimentar2 = factory2.creareProdus("paine", new Date(2023, 03, 29), listaPreturi);

        IFactory factory3 = null;
        factory3 = new FactoryProdusBirotica();

        IProdus produsBirotica = null;
        produsBirotica = factory3.creareProdus("creion", new Date(2023, 04, 1), listaPreturi2);

        IFactory factory4 = null;
        factory4 = new FactoryProdusIgiena();

        IProdus produsIgiena = null;
        produsIgiena=factory4.creareProdus("Sapun lichid", new Date(2023,05,1), listaPreturi3);

        produsAlimentar.afisareDescriere();
        produsAlimentar2.afisareDescriere();
        produsBirotica.afisareDescriere();
        produsIgiena.afisareDescriere();
    }
}
