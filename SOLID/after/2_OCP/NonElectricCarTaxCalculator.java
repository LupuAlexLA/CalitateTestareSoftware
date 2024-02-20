package implementare_solid_chat_gpt.after.OCP;

public class NonElectricCarTaxCalculator implements TaxCalculator{
    @Override
    public double calculateTax(Car car) {
        return 200; // Taxă pentru mașinile non-electrice
    }
}
