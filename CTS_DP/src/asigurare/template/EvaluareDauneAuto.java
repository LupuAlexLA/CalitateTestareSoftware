package asigurare.template;

public class EvaluareDauneAuto extends EvaluareDaune{
    @Override
    public void deplasare() {
        System.out.println("Deplasare la fata locului (accidentului)");
    }

    @Override
    public void identificareDaune() {
        System.out.println("Identificare daune auto");
    }

    @Override
    public void consultareAnalisti() {
        System.out.println("Contactare analisti daune auto si transmitere date initiale");
    }

    @Override
    public void consultareFirmaAsiguratoare() {
        System.out.println("Contactare firma asiguratoare auto si transmitere date analisti");
    }

    @Override
    public void evaluareFinalaDaune() {
        System.out.println("Preluare date ale daunelor cladirii catre firma asiguratoare si transmitere la clienti");
    }
}
