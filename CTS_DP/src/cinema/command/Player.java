package cinema.command;

import java.util.LinkedList;

public class Player {
    LinkedList<ICommand> comenzi = new LinkedList<ICommand>();

    public void invoca(ICommand comanda) {
        comenzi.add(comanda);
        comanda.execute();
    }

    public void undo() {
        comenzi.pollLast().unexecute();
    }
}
