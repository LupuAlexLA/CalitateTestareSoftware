package asigurare.state;

public class ContractAsigurari {
    Stare stareCurenta;

    public ContractAsigurari() {
        this.stareCurenta = new StareNegociere();
    }

    public void setStare(Stari stare) {
        if(stare == Stari.NEGOCIERE) {
            this.stareCurenta = new StareNegociere();
        } else {
            if(stare == Stari.INCHEIAT) {
                this.stareCurenta = new StareIncheiat();
            } else {
                if(stare == Stari.ANULAT) {
                    this.stareCurenta = new StareAnulare();
                } else {
                    this.stareCurenta = new StareModificare();
                }
            }
        }
    }

    public void mesaj(String text) {
        this.stareCurenta.mesaj(text);
    }
}
