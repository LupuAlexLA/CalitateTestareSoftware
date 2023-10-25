package asigurare.template;

public abstract class EvaluareDaune {
    public abstract void deplasare();
    public abstract void identificareDaune();
    public abstract void consultareAnalisti();
    public abstract void consultareFirmaAsiguratoare();
    public abstract void evaluareFinalaDaune();

    public void evalueazaDaune() {
        deplasare();
        identificareDaune();
        consultareAnalisti();
        consultareFirmaAsiguratoare();
        evaluareFinalaDaune();
    }
}
