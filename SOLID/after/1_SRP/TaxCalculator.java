package implementare_solid_chat_gpt.after.SRP;

public class TaxCalculator {
    public double calculateTax(Car car) {
        if ("Electric".equals(car.getCarType())) {
            return 100; // Taxă fixă pentru mașinile electrice
        } else {
            return 200; // Taxă pentru mașinile non-electrice
        }
    }
}
