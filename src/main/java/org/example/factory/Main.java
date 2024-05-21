package org.example.factory;

public class Main {
    public static void main(String[] args) {
        Pc pc1 = new Pc(16, 240);
        System.out.println(pc1.getRam());
        System.out.println(pc1.getHdd());

        Server server1 = new Server(8, 120, 3);
        System.out.println(server1.getRam());
        System.out.println(server1.getHdd());

        Computer pc2 = new Pc(32, 1024);
        Computer server2 = new Server(32, 1024, 12);
        System.out.println(pc2.getRam() + " " + pc2.getHdd());
        System.out.println(server2.getRam() + " " + server2.getHdd());

        Computer server3 = Factory.createComputer("Server", 128, 240);
        System.out.println(server3);
        Computer pc3 = Factory.createComputer("pc", 32, 1024);
        System.out.println(pc3.getRam() + pc3.getHdd());
    }
}
