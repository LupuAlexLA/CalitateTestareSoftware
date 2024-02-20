package implementare_solid_chat_gpt.after.LSP;

public class ElectricCar extends Car{
    public ElectricCar(String make, String model) {
        super(make, model);
    }

    @Override
    public void displayTaxInformation() {
        System.out.println("Electric Car Tax for " + make + " " + model + ": 100");
    }
}
