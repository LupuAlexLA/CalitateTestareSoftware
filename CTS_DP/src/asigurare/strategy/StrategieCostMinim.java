package asigurare.strategy;

import java.util.List;

public class StrategieCostMinim implements IProcesabil{
    @Override
    public OfertaAsigurare alegereOferta(List<OfertaAsigurare> listaOferte) {
        OfertaAsigurare ofertaCostMinim = listaOferte.get(0);

        for(int i = 0; i < listaOferte.size(); i++) {
            if(listaOferte.get(i).getCostAsigurare() < ofertaCostMinim.getCostAsigurare()) {
                ofertaCostMinim = listaOferte.get(i);
            }
        }

        return ofertaCostMinim;
    }
}
