package implementare_solid_chat_gpt.after.SRP;

import java.util.ArrayList;
import java.util.List;

public class CarInventory {
    private List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
        System.out.println("Car added: " + car.getMake() + " " + car.getModel());
    }

    // Metodă pentru a returna lista de mașini (pentru utilizare în alte clase, dacă este necesar)
    public List<Car> getCars() {
        return cars;
    }
}
