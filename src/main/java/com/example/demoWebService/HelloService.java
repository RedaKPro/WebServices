package com.example.demoWebService;

import org.springframework.web.bind.annotation.*;

@RestController

public class HelloService {

    @GetMapping (value="/")
    public String hello() {
        return "Bonjour";
    }

//    @GetMapping("/newCar")
//    public Car getNewVoiture(){
//        Car car = new Car();
//        car.setPlateNumber("118AD7D");
//        return car;
//    }

    @GetMapping("/person")
    public String getPerson(){

        Person person = new Person("Khettab", "Reda");

        return person.getNom();
    }
}
