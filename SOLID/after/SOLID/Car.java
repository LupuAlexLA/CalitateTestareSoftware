package implementare_solid_chat_gpt.after.SOLID;
// Definirea modelului de mașină
public class Car {
    private String type;
    private String make;
    private String model;

    public Car(String type, String make, String model) {
        this.type = type;
        this.make = make;
        this.model = model;
    }

    // Getteri
    public String getType() { return type; }
    public String getMake() { return make; }
    public String getModel() { return model; }
}
