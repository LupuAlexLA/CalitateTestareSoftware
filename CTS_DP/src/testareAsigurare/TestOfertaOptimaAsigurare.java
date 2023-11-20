package testareAsigurare;

import junit.framework.TestCase;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestOfertaOptimaAsigurare extends TestCase {
    ListaOferteAsigurare listaOferteAsigurare;
    OfertaAsigurare ofertaAsigurare1;
    OfertaAsigurare ofertaAsigurare2;
    OfertaAsigurare ofertaAsigurare3;
    OfertaAsigurare ofertaAsigurare4;
    float pragMaximAsigurare;

    public TestOfertaOptimaAsigurare() {
        listaOferteAsigurare = new ListaOferteAsigurare();
        ofertaAsigurare1 = new OfertaAsigurare("Tiriac Auto",10000, 450);
        ofertaAsigurare2 = new OfertaAsigurare("Groupama", 8000, 500);
        ofertaAsigurare3 = new OfertaAsigurare("Omniasig", 8000, 300);
        ofertaAsigurare4 = new OfertaAsigurare("Euroins", 9000, 350);
        listaOferteAsigurare.addOferta(ofertaAsigurare1);
        listaOferteAsigurare.addOferta(ofertaAsigurare2);
        listaOferteAsigurare.addOferta(ofertaAsigurare3);
        listaOferteAsigurare.addOferta(ofertaAsigurare4);

        pragMaximAsigurare = 400;
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("Apel setUpBeforeClass");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("Apel tearDownAfterClass");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Apel setUp");
    }

    @Test
    public void tearDown() throws Exception {
        System.out.println("Apel tearDown");
    }

    @Test
    public void testRight1() {
        double rezultatPragAsigurare;
        double expectedPragAsigurare = 300;
        OfertaAsigurare ofertaOptima = listaOferteAsigurare.getAsigurareOptima(pragMaximAsigurare);
        rezultatPragAsigurare = ofertaOptima.getCostAsigurare();

        assertEquals("Verificare prag asigurare cu valoare corecta",
                expectedPragAsigurare, rezultatPragAsigurare, 0.01);
    }

    @Test
    public void testRight2() {
        double rezultatPragAsigurare;
        boolean ok;
        OfertaAsigurare ofertaOptima = listaOferteAsigurare.getAsigurareOptima(pragMaximAsigurare);
        rezultatPragAsigurare = ofertaOptima.getCostAsigurare();

        if(rezultatPragAsigurare < pragMaximAsigurare) {
            ok = true;
        } else {
            ok = false;
        }

        assertTrue("Verificare prag asigurare < prag maxim client", ok);
    }

    @Test
    public void testRight3() {
        double rezultatLimitaMaximaAsigurata;
        double expectedLimitaMaximaAsigurata = 8000;
        OfertaAsigurare ofertaOptima = listaOferteAsigurare.getAsigurareOptima(pragMaximAsigurare);
        rezultatLimitaMaximaAsigurata = ofertaOptima.getLimitaMaximaAsigurata();

        assertEquals("Verificare limita maxima asigurata cu valoare corecta",
                expectedLimitaMaximaAsigurata, rezultatLimitaMaximaAsigurata, 0.01);
    }

    @Test
    public void testExistence1() {
        double rezultatPragAsigurare;
        OfertaAsigurare ofertaOptima = listaOferteAsigurare.getAsigurareOptima(pragMaximAsigurare);
        rezultatPragAsigurare = ofertaOptima.getCostAsigurare();

        assertNotNull("Verificare returnare valoare", ofertaOptima);
    }

    @Test
    public void testExistence2() {
        double rezultatPragAsigurare;
        boolean ok = false;
        OfertaAsigurare ofertaOptima = listaOferteAsigurare.getAsigurareOptima(pragMaximAsigurare);
        rezultatPragAsigurare = ofertaOptima.getCostAsigurare();

        for(int i = 0; i < listaOferteAsigurare.listaOferte.size(); i++) {
            if(listaOferteAsigurare.listaOferte.get(i).getCostAsigurare() == rezultatPragAsigurare) {
                ok = true;
            }
        }

        assertTrue("Verificare existenta rezultat in lista de contracte", ok);
    }

    @Test
    public void testRange() {
        double rezultatPragAsigurare;
        boolean ok;
        double valMinimCostAsigurare;
        double valMaximCostAsigurare;
        OfertaAsigurare ofertaOptima = listaOferteAsigurare.getAsigurareOptima(pragMaximAsigurare);
        rezultatPragAsigurare = ofertaOptima.getCostAsigurare();

        valMinimCostAsigurare = listaOferteAsigurare.listaOferte.get(0).getCostAsigurare();
        valMaximCostAsigurare = listaOferteAsigurare.listaOferte.get(0).getCostAsigurare();

        for(int i = 0; i < listaOferteAsigurare.listaOferte.size(); i++) {
            if(listaOferteAsigurare.listaOferte.get(i).getCostAsigurare() > valMaximCostAsigurare) {
                valMaximCostAsigurare = listaOferteAsigurare.listaOferte.get(i).getCostAsigurare();
            }
            if(listaOferteAsigurare.listaOferte.get(i).getCostAsigurare() < valMinimCostAsigurare) {
                valMinimCostAsigurare = listaOferteAsigurare.listaOferte.get(i).getCostAsigurare();
            }
        }

        if(rezultatPragAsigurare >= valMinimCostAsigurare && rezultatPragAsigurare <= valMaximCostAsigurare) {
            ok = true;
        } else {
            ok = false;
        }

        assertTrue("Verificare existenta rezultat in limitele valorilor din lista de asigurari", ok);
    }

    @Test
    public void testCrossCheck1() {
        double rezultatPragAsigurare;
        double expectedPragAsigurare = 300;

        List<OfertaAsigurare> listaOferte = new ArrayList<OfertaAsigurare>();

        for(int i = 0; i < listaOferteAsigurare.listaOferte.size(); i++) {
            if(listaOferteAsigurare.listaOferte.get(i).getCostAsigurare() < pragMaximAsigurare) {
                listaOferte.add(listaOferteAsigurare.listaOferte.get(i));
            }
        }

        OfertaAsigurare ofertaOptima = listaOferte.get(0);
        float raport;

        for(int i = 1; i < listaOferte.size(); i++) {
            raport = listaOferte.get(i).getLimitaMaximaAsigurata() / listaOferte.get(i).getCostAsigurare();
            if(raport > ofertaOptima.getLimitaMaximaAsigurata()/ofertaOptima.getCostAsigurare()) {
                ofertaOptima = listaOferte.get(i);
            }
        }

        rezultatPragAsigurare = ofertaOptima.getCostAsigurare();
        assertEquals("Verificare prag asigurare cu valoare corecta folosind cross-check",
                expectedPragAsigurare, rezultatPragAsigurare, 0.01);
    }

    @Test
    public void testCrossCheck2() {
        double rezultatPragAsigurare;
        double expectedPragAsigurare = 300;
        double raport1, raport2;
        OfertaAsigurare auxOfertaAsigurare;

        List<OfertaAsigurare> listaOferte = new ArrayList<OfertaAsigurare>();

        for(int i = 0; i < listaOferteAsigurare.listaOferte.size(); i++) {
            if(listaOferteAsigurare.listaOferte.get(i).getCostAsigurare() < pragMaximAsigurare) {
                listaOferte.add(listaOferteAsigurare.listaOferte.get(i));
            }
        }

        for(int i = 0; i < listaOferte.size() && listaOferte.size() != 1; i++) {
            for(int j = i + 1; j < listaOferte.size() && listaOferte.size() != 1; j++) {
                raport1 = listaOferte.get(i).getLimitaMaximaAsigurata() / listaOferte.get(i).getCostAsigurare();
                raport2 = listaOferte.get(j).getLimitaMaximaAsigurata() / listaOferte.get(j).getCostAsigurare();
                if(raport1 < raport2) {
                    listaOferte.remove(i);
                } else {
                    listaOferte.remove(j);
                }
            }
        }

        rezultatPragAsigurare = listaOferte.get(0).getCostAsigurare();
        assertEquals("Verificare prag asigurare cu valoare corecta folosind cross-check",
                expectedPragAsigurare, rezultatPragAsigurare, 0.01);
    }
}



