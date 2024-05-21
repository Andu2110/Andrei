package org.example.abstractFactory;

public class ServerFactory implements ComputerAbstractFactory{

    private Integer ram;
    private Integer hardDisk;
    private Integer componentNumber;

    public ServerFactory(Integer ram, Integer hardDisk, Integer componentNumber) {
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.componentNumber = componentNumber;
    }

    @Override
    public Computer createComputer() {
        return new Server(ram, hardDisk, componentNumber);
    }
}
