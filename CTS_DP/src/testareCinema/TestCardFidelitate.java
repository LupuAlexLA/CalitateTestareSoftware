package testareCinema;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;

public class TestCardFidelitate {
    private CardFidelitate cf;

    @Before
    public void before() {
        cf = new CardFidelitate("Detinator", 12345, 10);
    }

    @Test
    @Category(TesteVanzare.class)
    public void testVanzare_Right() throws Exception {
        cf.vanzare(20);
        assertEquals(12, cf.getNrPuncte());
    }
    @Test
    @Category (TesteAchizitie.class)
    public void testAchizitie_Right() throws Exception {
        cf.achizitiePePuncte(8);
        assertEquals(2, cf.getNrPuncte ());
    }

    @Test
    @Category(TesteVanzare.class)
    public void testVanzare_Right_real() throws Exception {
        cf.vanzare(15);
        assertEquals(11.5, cf.getNrPuncte(), 0.001);
    }

    @Test
    @Category(TesteAchizitie.class)
    public void testAchizitie_Right_real() throws Exception {
        cf.achizitiePePuncte(8.5);
        assertEquals(1.5, cf.getNrPuncte(), 0.001);
    }

    @Test
    @Category(TesteVanzare.class)
    public void testVanzare_В() throws Exception {
        cf.vanzare(0);
        assertEquals(10, cf.getNrPuncte(), 0.001);
    }
    @Test
    @Category (TesteAchizitie.class)
    public void testAchizitie_B() throws Exception {
        cf.achizitiePePuncte(10);
        assertEquals(0, cf. getNrPuncte (), 0.001);
    }

    @Test
    @Category (TesteVanzare.class)
    public void testVanzareAchizitie_I() throws Exception {
        double nrPunctelnitial = cf.getNrPuncte();
        cf.vanzare(100);
        cf.achizitiePePuncte(10);
        assertEquals(nrPunctelnitial, cf.getNrPuncte(), 0.001);
    }

    @Test
    @Category(TesteVanzare.class)
    public void testVanzare_CO() throws Exception {
        double nrPunctelnitial = cf.getNrPuncte();
        cf.vanzare(100);
        double nrPuncte = nrPunctelnitial += 100 / 10;
        assertEquals(nrPuncte, cf. getNrPuncte(), 0.001);
    }
    @Test
    @Category (TesteAchizitie.class)
    public void testAchizitie_C() throws Exception {
        double nrPunctelnitial = cf.getNrPuncte();
        double suma = 8.0;
        cf.achizitiePePuncte(suma);
        double nrPuncte = nrPunctelnitial - suma;
        assertEquals(nrPuncte, cf.getNrPuncte(), 0.001);
    }

    @Test
    @Category (TesteAchizitie.class)
    public void testAchizitie_E() {
        try {
            cf.achizitiePePuncte(12);
            fail("Metoda trebuia sa arunce o exceptie");
        } catch (Exception er) {
            assertTrue(true);
        }
    }

    @Test
    @Category(TesteVanzare. class)
    public void testVanzare_E(){
        try {
            cf.vanzare(-10);
            fail("Metoda trebuia sa arunce o exceptie");
        } catch (Exception ex) {
            assertTrue(true);
        }
    }

    @Test(timeout = 10)
    @Category (TesteVanzare.class)
    public void testVanzare_P() throws Exception {
        cf.vanzare(9);
    }

}























