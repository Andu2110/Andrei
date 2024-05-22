package org.example.decorator;

public class BasicCar implements Car{
    private String color;
    private int horsePower;

    public BasicCar(String color, int horsePower) {
        this.color = color;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BasicCar{");
        sb.append("color='").append(color).append('\'');
        sb.append(", horsePower=").append(horsePower);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void assemble() {
        System.out.println("Preparing basic car color " + color + " " + horsePower + " and horsepower");
    }

    @Override
    public int changeHorsePower(int value) {
        this.horsePower += value;
        return horsePower;
    }
}
