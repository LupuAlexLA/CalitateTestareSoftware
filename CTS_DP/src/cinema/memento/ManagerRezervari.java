package cinema.memento;

import java.util.ArrayList;
import java.util.List;

public class ManagerRezervari {
    private List<RezervareMemento> lista = new ArrayList<RezervareMemento>();

    public void add(RezervareMemento rezervare) {
        lista.add(rezervare);
    }

    public RezervareMemento get(int index) {
        return lista.get(index);
    }

    public RezervareMemento lastMemento() {
        if(lista.size() != 0) {
            RezervareMemento ultima = lista.get(lista.size() - 1);
            lista.remove(lista.size() - 1);
            return ultima;
        } else {
            return new RezervareMemento(0);
        }
    }
}
