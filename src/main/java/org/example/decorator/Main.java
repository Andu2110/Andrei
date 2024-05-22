package org.example.decorator;

public class Main {
    public static void main(String[] args) {
        BasicCar car1 = new BasicCar("Black", 400);
//        car1.assemble();
        Car luxuryCar = new LuxuryCar(car1, true);
//        luxuryCar.assemble();
        Car sportLuxuryCar = new SportsCar(luxuryCar, 50);
//        sportLuxuryCar.assemble();

        Car basicCar = new BasicCar("blue", 100);
        Car sportsCar = new SportsCar(basicCar, 150);
        sportsCar.assemble();
    }
}
