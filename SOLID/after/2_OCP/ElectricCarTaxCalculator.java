package implementare_solid_chat_gpt.after.OCP;

public class ElectricCarTaxCalculator implements TaxCalculator{
    @Override
    public double calculateTax(Car car) {
        return 100; // Taxă fixă pentru mașinile electrice
    }
}
