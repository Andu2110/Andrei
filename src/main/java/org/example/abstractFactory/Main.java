package org.example.abstractFactory;

public class Main {
    public static void main(String[] args) {
        Computer server = ComputerFactory.createComputer(new ServerFactory(16, 240, 3));
        System.out.println(server.getHdd());
        System.out.println(server.getRam());

        Computer pc = ComputerFactory.createComputer(new PcFactory(32, 1024));
        System.out.println(pc.getRam());
        System.out.println(pc.getHdd());
    }
}
