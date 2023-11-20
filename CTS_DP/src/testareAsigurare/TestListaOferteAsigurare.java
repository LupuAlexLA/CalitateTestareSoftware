package testareAsigurare;

public class TestListaOferteAsigurare {
    public static void main(String[] args) throws ExceptionListaContracteValideVida, ExceptionPragAsigurareNegativ, ExceptionListaContracteVida {
        ListaOferteAsigurare listaOferteAsigurare = new ListaOferteAsigurare();
        OfertaAsigurare ofertaAsigurare1 = new OfertaAsigurare("Tiriac Auto",
                10000, 450);
        OfertaAsigurare ofertaAsigurare2 = new OfertaAsigurare("Groupama",
                8000, 500);
        OfertaAsigurare ofertaAsigurare3 = new OfertaAsigurare("Omniasig",
                8000, 300);
        OfertaAsigurare ofertaAsigurare4 = new OfertaAsigurare("Euroins",
                9000, 350);

        listaOferteAsigurare.addOferta(ofertaAsigurare1);
        listaOferteAsigurare.addOferta(ofertaAsigurare2);
        listaOferteAsigurare.addOferta(ofertaAsigurare3);
        listaOferteAsigurare.addOferta(ofertaAsigurare4);
        System.out.println("Lista Oferte Asigurare");
        listaOferteAsigurare.afisareListaOferte();

        OfertaAsigurare ofertaOptima = listaOferteAsigurare.getAsigurareOptima(400);
        System.out.println("\n");
        System.out.println(ofertaOptima);
    }
}
