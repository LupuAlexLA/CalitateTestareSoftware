package asigurare.strategy;

import java.util.ArrayList;
import java.util.List;

public class ListaOferteAsigurare {
    List<OfertaAsigurare> listaOferte = new ArrayList<OfertaAsigurare>();
    protected IProcesabil strategie;

    public void addOferta(OfertaAsigurare oferta) {
        listaOferte.add(oferta);
    }

    public void setStrategie(IProcesabil strategie) {
        this.strategie = strategie;
    }

    public OfertaAsigurare alegereOferta() {
        if(strategie != null) {
            return strategie.alegereOferta(listaOferte);
        } else {
            throw new UnsupportedOperationException();
        }
    }
}
