package org.example.singleton;

import java.rmi.ServerError;

public class Main {
    public static void main(String[] args) {
//        Servers server = new Servers();
        Servers.getInstance();
        Servers servers1 = Servers.getInstance();
        Servers servers2 = Servers.getInstance();
//        System.out.println(servers2);
//        System.out.println("---------");
//        System.out.println(servers1);
        servers1.addServer("http://eu.com");
//        System.out.println(servers1);
        servers2.addServer("https://yt.be");
//        System.out.println(servers2);
        servers2.downloadHttp();
        System.out.println(servers1.downloadHttps());
    }
}
