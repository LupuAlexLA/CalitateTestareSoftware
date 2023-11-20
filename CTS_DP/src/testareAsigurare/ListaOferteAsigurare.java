package testareAsigurare;

import java.util.ArrayList;
import java.util.List;

public class ListaOferteAsigurare {
    List<OfertaAsigurare> listaOferte = new ArrayList<OfertaAsigurare>();

    public void addOferta(OfertaAsigurare oferta) {
        listaOferte.add(oferta);
    }

    public OfertaAsigurare getOferta(int index) {
        return listaOferte.get(index);
    }

    public OfertaAsigurare getAsigurareOptima(float pragAsigurare) {
        OfertaAsigurare ofertaOptima = listaOferte.get(0);
        float raport;

        for(int i = 1; i < listaOferte.size(); i++) {
            raport = listaOferte.get(i).getLimitaMaximaAsigurata() / listaOferte.get(i).getCostAsigurare();
            if(raport > ofertaOptima.getLimitaMaximaAsigurata() / ofertaOptima.getCostAsigurare() &&
                    listaOferte.get(i).getCostAsigurare() < pragAsigurare) {
                ofertaOptima = listaOferte.get(i);
            }
        }
        return ofertaOptima;
    }

    public void afisareListaOferte() {
        for (OfertaAsigurare oferta : listaOferte) {
            System.out.println(oferta);
        }
    }
}
