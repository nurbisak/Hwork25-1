package com.animal;

public class Car {
    private String id;
    private int carNumber;

    public Car(String id, int carNumber) {
        this.id = id;
        this.carNumber = carNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }

    @Override
    public String toString() {
        return "" +
                "id=" + id +
                ", car Number:" + carNumber
                ;
    }
}
