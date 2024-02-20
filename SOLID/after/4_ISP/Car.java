package implementare_solid_chat_gpt.after.ISP;

public class Car {
    private String type;
    private String make;
    private String model;

    // Constructor și getteri
    public Car(String type, String make, String model) {
        this.type = type;
        this.make = make;
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}
