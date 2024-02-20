package implementare_solid_chat_gpt.after.DIP;

import java.util.ArrayList;
import java.util.List;

public class InMemoryCarRepository implements CarRepository {
    private List<Car> cars = new ArrayList<>();

    @Override
    public void addCar(Car car) {
        cars.add(car);
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }
}
