package org.example.abstractFactory;

public class Server extends Computer {

    private Integer ramPerComponent;
    private Integer hddPerComponent;
    private Integer componentNumber;

    public Server(Integer ramPerComponent, Integer hddPerComponent, Integer componentNumber) {
        this.ramPerComponent = ramPerComponent;
        this.hddPerComponent = hddPerComponent;
        this.componentNumber = componentNumber;
    }

    @Override
    public String getRam() {
        return "Server RAM is: " + ramPerComponent * componentNumber;
    }

    @Override
    public String getHdd() {
        return "Server HDD is: " + hddPerComponent * componentNumber;
    }
}
