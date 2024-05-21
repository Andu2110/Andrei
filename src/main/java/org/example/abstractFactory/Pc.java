package org.example.abstractFactory;

public class Pc extends Computer {

    private Integer ram;
    private Integer hardDisk;

    public Pc(Integer ram, Integer hardDisk) {
        this.ram = ram;
        this.hardDisk = hardDisk;
    }

    @Override
    public String getRam() {
        return "PC RAM: " + ram;
    }

    @Override
    public String getHdd() {
        return "PC HDD: " + hardDisk;
    }
}
