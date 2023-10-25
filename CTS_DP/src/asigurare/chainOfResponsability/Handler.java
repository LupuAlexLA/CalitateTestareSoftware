package asigurare.chainOfResponsability;

public abstract class Handler {
    protected Handler succesor = null;

    public void setSuccesor(Handler succesor) {
        this.succesor = succesor;
    }

    public abstract void procesareCerere(Alerta alerta);
}
