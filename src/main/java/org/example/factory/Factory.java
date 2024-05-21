package org.example.factory;

import java.util.Scanner;

public class Factory {
    public static Computer createComputer(String computerType, Integer ram, Integer hdd) {
        if("Pc".equals(computerType.toLowerCase())) {
            return new Pc(ram, hdd);
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Insert number of components: ");
            Integer numberOfComponents = scanner.nextInt();
            return new Server(ram, hdd, numberOfComponents);
        }
    }
}
