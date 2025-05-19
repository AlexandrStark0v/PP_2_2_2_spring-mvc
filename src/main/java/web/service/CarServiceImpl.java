package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{
    private final List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<Car>();
        cars.add(new Car("Volga", "110",1987));
        cars.add(new Car("Gigul", "01",1991));
        cars.add(new Car("BMW", "X5",2020));
        cars.add(new Car("AUDI", "RS7",2023));
        cars.add(new Car("Tesla", "S",2018));
    }



    @Override
    public List<Car> getCars(Integer count) {
        if(count == null || count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
