package asigurare.facade;

public class AsigurareDezastreNaturale {
    protected boolean esteInclusa = false;

    public void adauga() {
        this.esteInclusa = true;
        System.out.println("Asigurare Dezastre Naturale adaugata");
    }

    public void elimina() {
        this.esteInclusa = false;
        System.out.println("Asigurare Dezastre Naturale eliminata");
    }
}
