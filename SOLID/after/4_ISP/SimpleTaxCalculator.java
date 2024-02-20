package implementare_solid_chat_gpt.after.ISP;

public class SimpleTaxCalculator implements TaxCalculator {
    @Override
    public double calculateTax(Car car) {
        if (car.getType().equals("Electric")) {
            return 100;
        } else {
            return 200;
        }
    }
}
