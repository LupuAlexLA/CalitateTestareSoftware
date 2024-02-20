package implementare_solid_chat_gpt.after.ISP;

import java.util.List;

public class SimpleCarAdder implements CarAdder {
    private List<Car> cars;

    public SimpleCarAdder(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public void addCar(Car car) {
        cars.add(car);
        System.out.println("Car added: " + car.getMake() + " " + car.getModel());
    }
}
