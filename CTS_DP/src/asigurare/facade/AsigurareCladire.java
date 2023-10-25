package asigurare.facade;

public class AsigurareCladire {
    protected boolean esteInclusa = false;

    public void adauga() {
        this.esteInclusa = true;
        System.out.println("Asigurare Cladire adaugata");
    }

    public void elimina() {
        this.esteInclusa = false;
        System.out.println("Asigurare Cladire eliminata");
    }
}
