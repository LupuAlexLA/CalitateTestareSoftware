package asigurare.observer;

import java.util.ArrayList;

public abstract class Mediatizabil {
    ArrayList<Observator> observatori = new ArrayList<Observator>();

    public void adaugareObservator(Observator observator) {
        observatori.add(observator);
    }

    public void eliminareObservator(Observator observator) {
        observatori.remove(observator);
    }

    public void notificareObservatori() {
        for(int i = 0; i < observatori.size(); i++) {
            observatori.get(i).procesare();
        }
    }
}
