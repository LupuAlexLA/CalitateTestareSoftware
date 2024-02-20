package implementare_solid_chat_gpt.after.LSP;

public class NonElectricCar extends Car{
    public NonElectricCar(String make, String model) {
        super(make, model);
    }

    @Override
    public void displayTaxInformation() {
        System.out.println("Non-Electric Car Tax for " + make + " " + model + ": 200");
    }
}
