package asigurare.strategy;

public class TestStrategy {
    public static void main(String[] args) {
        ListaOferteAsigurare listaOferteAsigurare = new ListaOferteAsigurare();

        OfertaAsigurare ofertaAsigurare1 = new OfertaAsigurare("Tiriac Auto", 10000, 450 );
        OfertaAsigurare ofertaAsigurare2 = new OfertaAsigurare("Groupama", 8000, 500 );
        OfertaAsigurare ofertaAsigurare3 = new OfertaAsigurare("Omniasig", 8000, 300 );
        OfertaAsigurare ofertaAsigurare4 = new OfertaAsigurare("Euroins", 9000, 350 );

        listaOferteAsigurare.addOferta(ofertaAsigurare1);
        listaOferteAsigurare.addOferta(ofertaAsigurare2);
        listaOferteAsigurare.addOferta(ofertaAsigurare3);
        listaOferteAsigurare.addOferta(ofertaAsigurare4);

        //alegere oferta cost minim
        StrategieCostMinim strategieCostMinim = new StrategieCostMinim();
        listaOferteAsigurare.setStrategie(strategieCostMinim);
        System.out.println("Oferta avand costul minim este: " + listaOferteAsigurare.alegereOferta());

        //alegere oferta cost maxim
        StrategieLimitaMaximaAsigurare strategieLimitaMaximaAsigurare = new StrategieLimitaMaximaAsigurare();
        listaOferteAsigurare.setStrategie(strategieLimitaMaximaAsigurare);
        System.out.println("\nOferta avand limita maxima de asigurare este: " + listaOferteAsigurare.alegereOferta());

        // alegere oferta raport optim intre limita asigurare si cost asigurare
        StrategieOptimCostLimita strategieOptimCostLimita = new StrategieOptimCostLimita();
        listaOferteAsigurare.setStrategie(strategieOptimCostLimita);
        System.out.println("\nOferta optima intre cost si limita asigurare este: " + listaOferteAsigurare.alegereOferta());
    }
}
