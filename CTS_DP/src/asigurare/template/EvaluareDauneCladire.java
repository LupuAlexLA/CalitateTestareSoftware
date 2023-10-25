package asigurare.template;

public class EvaluareDauneCladire extends EvaluareDaune{
    @Override
    public void deplasare() {
        System.out.println("Deplasare la cladirea clientului");
    }

    @Override
    public void identificareDaune() {
        System.out.println("Identificare daune cladire");
    }

    @Override
    public void consultareAnalisti() {
        System.out.println("Contactare analisti evaluare cladiri si transmitere date initiale");
    }

    @Override
    public void consultareFirmaAsiguratoare() {
        System.out.println("Contactare firma asiguratoare cladire si transmitere date analisti");
    }

    @Override
    public void evaluareFinalaDaune() {
        System.out.println("Preluare date ale daunelor cladirii catre firma asiguratoare si transmitere la client");
    }
}
