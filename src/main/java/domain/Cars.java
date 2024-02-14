package domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private List<Car> cars;

    public Cars(List<String> carNames) {
        // 자동차 개수 검증
        if(carNames.size() <= 1) {
            throw new IllegalArgumentException();
        }

        List<Car> cars = new ArrayList<>();
        for (String carName : carNames) {
            cars.add(new Car(carName));
        }
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }
}
