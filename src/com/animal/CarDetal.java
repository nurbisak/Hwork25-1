package com.animal;

public class CarDetal {
    private int year;
private String color;
private String model;
private int price;

    public CarDetal(int year, String color, String model, int price) {
        this.year = year;
        this.color = color;
        this.model = model;
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CarDetal(" +
                "year:" + year +
                ", color:'" + color + '\'' +
                ", model:'" + model + '\'' +
                ", price:" + price;
    }
}
