package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;

@RestController
public class bonjour {

    @GetMapping("/hello/{plateNumber}")
    public String liste(
            @PathVariable("plateNumber") String PlateNumber,
            @RequestParam(value = "rent", required = true) boolean rent){
        //hello/11AA22?rent=true
        System.out.println(rent);
        return PlateNumber;
    }

    @PutMapping("/hello")
    public void louer(@RequestBody Dates dates){
        System.out.println(dates);
    }

    //gestion des erreurs

//    @ResponseStatus(value= HttpStatus.NOT_FOUND, reason="Car not found")  // 404
//    @ExceptionHandler(Exception.class)
//    public void erreur() {
//        System.out.println("ici");
//    }

//    @GetMapping("/cars/{plateNumber}")
//    public String liste(
//            @PathVariable("plateNumber") String plateNumber,
//            @RequestParam(value = "rent", required = true) boolean rent) throws Exception {
//        System.out.println(plateNumber);
//        System.out.println(rent);
//        for(Car car: cars){
//            if(car.getPlateNumber().equals(plateNumber)){
//                // ....
//                return "zregrze";
//            }
//        }
//        throw new Exception();
//    }

}


