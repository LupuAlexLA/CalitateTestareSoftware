package testareCinema;

public class CardFidelitate {
    private final String detinator; private final int codCard; private double nrPuncte;
    public CardFidelitate(String detinator, int codCard, double nrPuncte) {
        super();
        this.detinator = detinator;
        this.codCard = codCard;
        this.nrPuncte = nrPuncte;
    }
    public String getDetinator() {
        return detinator;
    }
    public int getCodCard() {
        return codCard;
    }
    public double getNrPuncte() {
        return nrPuncte;
    }
    public void vanzare(double suma) throws Exception {
        if(suma > 0) {
            this.nrPuncte += suma / 10;
        } else {
            throw new Exception("Valoarea este negativa");
        }
    }
    public void achizitiePePuncte(double suma) throws Exception{
        if(this.nrPuncte >= suma) {
            this.nrPuncte -= suma;
        } else {
            throw new Exception("Suma este prea mare");
        }
    }
}
