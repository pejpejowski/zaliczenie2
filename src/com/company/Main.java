package com.company;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    enum Car {
        SMAX, GALAXY, SHARAN, SEICENTO, CINQUECENTO, FIESTA,
        MUSTANG, CRUZE, CAPTIVIA, AVEO, TIPO, DUCATO

    }

    static Deque<Clients> clientsD = new ArrayDeque<>();

    public static void main(String[] args) {
        System.out.println("S-Max to: " + kind(Car.SMAX));
        System.out.println("Sharan to: " + kind(Car.SHARAN));
        System.out.println("Captivia to: " + kind(Car.CAPTIVIA));
        System.out.println("Seicento to:" + kind(Car.SEICENTO));
        example();
        buy();
    }


    static String kind(Car product) {
        String category = "";
        switch (product) {
            case SMAX, GALAXY, MUSTANG, FIESTA -> category = "Ford.";
            case SEICENTO, CINQUECENTO, TIPO, DUCATO -> category = "Fiat.";
            case CRUZE, AVEO, CAPTIVIA -> category = "Chevrolet.";
            case SHARAN -> category = "Volkswagen.";
            default -> category = "Inna marka";
        }
        return category;
    }

    static void example() {
        System.out.println(Clients.info);
        for (Clients clients : Clients.values())
            System.out.println(clients.info());
        clientsD.offer(Clients.Jadwiga);
        clientsD.offer(Clients.Krystyna);
        clientsD.offer(Clients.Zygmunt);


    }

    static void buy() {
        while (!clientsD.isEmpty()) {
            Clients clients = clientsD.poll();
            System.out.println("");
            clients.buy();
        }
    }
}
