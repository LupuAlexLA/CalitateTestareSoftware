package testareAsigurare;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class OfertaAsigurareMock implements IOfertaAsigurare{
    @Override
    public float getCostAsigurare() {
        return 1500;
    }

    @Override
    public boolean checkCostAsigurare() {
        if(this.getCostAsigurare() > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Test
    public void testMock() {
        OfertaAsigurareMock ofertaAsigurare = new OfertaAsigurareMock();
        assertTrue("Verificare metoda cost asigurare", ofertaAsigurare.checkCostAsigurare());
    }
}
