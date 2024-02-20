package implementare_solid_chat_gpt.after.OCP;

public class Car {
    private String make;
    private String model;
    private TaxCalculator taxCalculator;

    public Car(String make, String model, TaxCalculator taxCalculator) {
        this.make = make;
        this.model = model;
        this.taxCalculator = taxCalculator;
    }

    // Getteri
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double calculateTax() {
        return taxCalculator.calculateTax(this);
    }
}
