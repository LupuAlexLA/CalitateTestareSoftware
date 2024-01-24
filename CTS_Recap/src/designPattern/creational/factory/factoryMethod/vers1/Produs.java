package designPattern.creational.factory.factoryMethod.vers1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public abstract class Produs implements IProdus{
    private String denumire;
    private Date dataExpirare;
    private List<Float> listaPreturi;
    public Produs(String denumire, Date dataExpirare, List<Float> listaPreturi) {
        this.denumire = denumire;
        this.dataExpirare = dataExpirare;
        this.listaPreturi = listaPreturi;
    }

    @Override
    public Date getValabilitate() {
        return dataExpirare;
    }
    @Override
    public void afisareDescriere() {
        System.out.println("Produsul: " + denumire + " este valabil pana la data de: " + dataExpirare);
    }
    @Override
    public List<Float> afisareIstoricPreturi(int nrLuni){
        List<Float> istoricPreturi = new ArrayList<>();
        for (int i = listaPreturi.size() - 1; i >= nrLuni; i--) {
            istoricPreturi.add(listaPreturi.get(i));
        }
        return istoricPreturi;
    }
}
