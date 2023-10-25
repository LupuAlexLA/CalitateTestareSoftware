package cinema.template;

public class TestTemplate {
    public static void main(String[] args) {
        ASpectacol film = new Film();
        ASpectacol piesaTeatru = new PiesaTeatru();

        film.ruleazaSpectacol();
        piesaTeatru.ruleazaSpectacol();
    }
}
