package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WebServiceCar {

    CarRepository carRepository;

    @Autowired
    public WebServiceCar(CarRepository carRepository){
        this.carRepository = carRepository;
        Car car = new Car();
        car.setPrice(1000);
        car.setPlateNumber("AA1188");
        carRepository.save(car);

    }

    @GetMapping("/cars")
    public Iterable<Car> getAllCars(){
        return carRepository.findAll();
    }
}
