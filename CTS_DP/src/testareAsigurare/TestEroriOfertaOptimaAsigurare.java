package testareAsigurare;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestEroriOfertaOptimaAsigurare {
    ListaOferteAsigurare listaOferteAsigurare;
    OfertaAsigurare ofertaAsigurare1;
    OfertaAsigurare ofertaAsigurare2;
    OfertaAsigurare ofertaAsigurare3;
    OfertaAsigurare ofertaAsigurare4;
    float pragMaximAsigurare;

    public TestEroriOfertaOptimaAsigurare() {
        listaOferteAsigurare = new ListaOferteAsigurare();
        ofertaAsigurare1 = new OfertaAsigurare("Tiriac Auto", 10000, 450);
        ofertaAsigurare2 = new OfertaAsigurare("Groupama", 8000, 500);
        ofertaAsigurare3 = new OfertaAsigurare("Omniasig", 8000, 300);
        ofertaAsigurare4 = new OfertaAsigurare("Euroins", 9000, 350);
        listaOferteAsigurare.addOferta(ofertaAsigurare1);
        listaOferteAsigurare.addOferta(ofertaAsigurare2);
        listaOferteAsigurare.addOferta(ofertaAsigurare3);
        listaOferteAsigurare.addOferta(ofertaAsigurare4);
        pragMaximAsigurare = 400;
    }

    @Test
    public void testErrorConditionsPragAsigurareNegativ() {
        pragMaximAsigurare = -10;
        try {
            OfertaAsigurare ofertaOptima =
                    listaOferteAsigurare.getAsigurareOptima(pragMaximAsigurare);
            assertTrue("Verificare prag asigurare negativ", false);
        } catch (Exception e) {
            e.printStackTrace();
            if (e instanceof ExceptionPragAsigurareNegativ) {
                assertTrue("Verificare prag asigurare negativ", true);
            } else {
                assertTrue("Exceptie diferita fata de prag de asigurare negativ", false);
            }
        }
    }

    @Test
    public void testErrorConditionsListaContracteVida() {
        pragMaximAsigurare = 400;
        ListaOferteAsigurare listaOferteVida = new ListaOferteAsigurare();
        try {
            OfertaAsigurare ofertaOptima = listaOferteVida.getAsigurareOptima(pragMaximAsigurare);
        } catch (Exception e) {
            e.printStackTrace();
            if (e instanceof ExceptionListaContracteVida) {
                assertTrue("Verificare lista contracte vida", true);
            } else {
                assertTrue("Verificare lista contracte vida", false);
            }
        }
    }

    @Test
    public void testErrorConditionsListaContracteValideVida() {
        pragMaximAsigurare = 50;
        try {
            OfertaAsigurare oferta0ptima =
                    listaOferteAsigurare.getAsigurareOptima(pragMaximAsigurare);
        } catch (Exception e) {
            e.printStackTrace();
            if (e instanceof ExceptionListaContracteValideVida) {
                assertTrue("Verificare lista contracte valide vida", true);
            } else {
                assertTrue("Verificare lista contracte valide vida", false);
            }
        }
    }
}













