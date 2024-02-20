package implementare_solid_chat_gpt.after.LSP;

public class TestLSP {
    public static void main(String[] args) {
        Car electricCar = new ElectricCar("Tesla", "Model S");
        Car nonElectricCar = new NonElectricCar("Ford", "Focus");

        displayCarTaxInformation(electricCar);
        displayCarTaxInformation(nonElectricCar);
    }

    public static void displayCarTaxInformation(Car car) {
        car.displayTaxInformation();
    }
}
