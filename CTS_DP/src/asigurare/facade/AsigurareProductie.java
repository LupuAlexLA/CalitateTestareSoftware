package asigurare.facade;

public class AsigurareProductie {
    protected boolean esteInclusa = false;

    public void adauga() {
        this.esteInclusa = true;
        System.out.println("Asigurare Productie adaugata");
    }

    public void elimina() {
        this.esteInclusa = false;
        System.out.println("Asigurare Productie eliminata");
    }
}
