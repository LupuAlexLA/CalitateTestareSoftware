package asigurare.chainOfResponsability;

public class Alerta {
    private int grad;
    private String mesaj;

    public Alerta(int grad, String mesaj) {
        this.grad = grad;
        this.mesaj = mesaj;
    }

    public int getGrad() {
        return grad;
    }

    public String getMesaj() {
        return mesaj;
    }
}
