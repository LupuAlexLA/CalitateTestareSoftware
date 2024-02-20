package implementare_solid_chat_gpt.after.LSP;

public abstract class Car {
    protected String make;
    protected String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public abstract void displayTaxInformation();

    // Getteri
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}
