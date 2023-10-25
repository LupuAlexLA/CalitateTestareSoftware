package asigurare.strategy;

import java.util.List;

public class StrategieOptimCostLimita implements IProcesabil{
    @Override
    public OfertaAsigurare alegereOferta(List<OfertaAsigurare> listaOferte) {
        OfertaAsigurare ofertaOptima = listaOferte.get(0);
        float raport;

        for(int i = 1; i < listaOferte.size(); i++) {
            raport = listaOferte.get(i).getLimitaMaximaAsigurata() / listaOferte.get(i).getCostAsigurare();
            if(raport > ofertaOptima.getLimitaMaximaAsigurata() / ofertaOptima.getCostAsigurare()) {
                ofertaOptima = listaOferte.get(i);
            }
        }

        return ofertaOptima;
    }
}
