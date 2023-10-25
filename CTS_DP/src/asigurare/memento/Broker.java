package asigurare.memento;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<VersiuneContract> listaVersiuni = new ArrayList<VersiuneContract>();

    public void adaugareVersiune(VersiuneContract versiune) {
        this.listaVersiuni.add(versiune);
    }

    public VersiuneContract recuperareUltimaVersiuneContract() {
        if(listaVersiuni.size() != 0) {
            VersiuneContract versiune = listaVersiuni.get(listaVersiuni.size() - 1);
            listaVersiuni.remove(listaVersiuni.size() - 1);
            return versiune;
        } else {
            return new VersiuneContract();
        }
    }
}
