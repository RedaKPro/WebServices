package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Component
@RestController
@SpringBootApplication
public class WebServiceCar {
    CarRepository carRepository;
    VanRepository vanRepository;
    PersonRepository personRepository;
    RentRepository rentRepository;

    String pattern = "yyyy-MM-dd";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    Date date = simpleDateFormat.parse("2020-01-01");
    Date date2 = simpleDateFormat.parse("2020-06-14");

    @Autowired
    public WebServiceCar(CarRepository carRepository, VanRepository vanRepository, PersonRepository personRepository, RentRepository rentRepository) throws ParseException {
        this.carRepository=carRepository;
        Car newcar = new Car();
        newcar.setPrice(10000);
        newcar.setBrand("Peugeot");
        newcar.setNumberOfSeats(4);
        newcar.setPlateNumber("14REK06");
        carRepository.save(newcar);

        Van newvan = new Van();
        newvan.setPrice(20000);
        newvan.setBrand("Volkswagen");
        newvan.setMaxWeight(2300);
        newvan.setPlateNumber("06KER14");
        vanRepository.save(newvan);

        Person newperson = new Person();
        newperson.setName("Reda");
        newperson.setAge(21);
        personRepository.save(newperson);

        Rent newrent = new Rent();
        newrent.setBeginRent(date);
        newrent.setEndRent(date2);
        rentRepository.save(newrent);
    }

    @GetMapping("/cars")
    public Iterable<Car> getAllCars(){
        return carRepository.findAll();
    }


}
