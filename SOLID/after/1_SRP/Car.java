package implementare_solid_chat_gpt.after.SRP;

public class Car {
    private String carType;
    private String make;
    private String model;

    public Car(String carType, String make, String model) {
        this.carType = carType;
        this.make = make;
        this.model = model;
    }

    // Getteri
    public String getCarType() {
        return carType;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}
