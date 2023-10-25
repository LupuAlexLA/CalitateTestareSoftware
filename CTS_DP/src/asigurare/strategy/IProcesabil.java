package asigurare.strategy;

import java.util.List;

public interface IProcesabil {
    public abstract OfertaAsigurare alegereOferta(List<OfertaAsigurare> listaOferte);
}
