package org.example.decorator;

public class SportsCar extends CarDecorator{
    private int addHorsePower;

    public SportsCar(Car car, int addHorsePower) {
        super(car);
        this.addHorsePower = addHorsePower;
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding sports elements. new HorsePower " + super.car.changeHorsePower(addHorsePower));
    }
    public SportsCar(Car car) {
        super(car);
    }
}

