package asigurare.strategy;

import java.util.List;

public class StrategieLimitaMaximaAsigurare implements IProcesabil{
    @Override
    public OfertaAsigurare alegereOferta(List<OfertaAsigurare> listaOferte) {
        OfertaAsigurare ofertaMaxima = listaOferte.get(0);

        for(int i = 0; i < listaOferte.size(); i++) {
            if(listaOferte.get(i).getLimitaMaximaAsigurata() > ofertaMaxima.getLimitaMaximaAsigurata()) {
                ofertaMaxima = listaOferte.get(i);
            }
        }

        return ofertaMaxima;
    }
}
