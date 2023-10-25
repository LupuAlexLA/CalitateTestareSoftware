package asigurare.facade;

public class AsigurareParcAuto {
    protected boolean esteInclusa = false;

    public void adauga() {
        this.esteInclusa = true;
        System.out.println("Asigurare Parc Auto adaugata");
    }

    public void elimina() {
        this.esteInclusa = false;
        System.out.println("Asigurare Parc Auto eliminata");
    }
}
