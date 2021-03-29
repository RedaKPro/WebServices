package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {

    private String plateNumber;
    private float price;
    private long key;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public long getKey() {
        return key;
    }

    public void setKey(long key) {
        this.key = key;
    }
}
