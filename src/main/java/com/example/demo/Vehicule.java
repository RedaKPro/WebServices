package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehicule {
    public Vehicule()
        {
            super();
        }

    public Vehicule(String plateNumber)
    {
        super();
        this.plateNumber = plateNumber;
    }

    private String brand;
    private String plateNumber;
    private int price;
    private int numberOfSeats;
    private int id;


    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    public int getId(){
         return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}