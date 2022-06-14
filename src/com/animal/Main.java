package com.animal;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static <carDetal> void main(String[] args) {
        /**
         Car деген класс тузунуз (Id, номер авто)
         Дагы бир класс тузунуз, ал класста машинанын данныйлары сакталат
         (год выпуска, модель, цена, цвет)
         HashMap тузунуз ключ - машина, маани - машинанын данныйлары
         HashMapти толтуруп кайра entrySet деген методун колдонуп
         баардык элементтерин консольго чыгарыныз.
         **/

        Map<Car, CarDetal> hashMap = new HashMap<>();
        Car car = new Car("Nurbek", 153);
        CarDetal carDetal = new CarDetal(2008, "white", "Toyota", 10000);
        hashMap.put(car, carDetal);
        Car car1 = new Car("Almaz", 617);
        CarDetal carDetal1 = new CarDetal(2014, "Black", "Lexus", 35000);
        hashMap.put(car, carDetal1);
        Car car2 = new Car("Dastan", 233);
        CarDetal carDetal2 = new CarDetal(2014, "White", "Prius", 15000);
        hashMap.put(car2, carDetal2);

        for (Map.Entry s : hashMap.entrySet()) {
            System.out.println(s);

        }


    }
}
