package org.example;

import static org.example.AirplaneType.*;

public class Main {
    public static void main(String[] args) {
      Airport airport = new Airport("Manas", "Bishkek 720061");
      PassengerPlane passengerPlane = new PassengerPlane(1911 , PASSENGER, airport , 130,130);
      PassengerPlane passengerPlane2 = new PassengerPlane(1988 , MILITARY, airport , 160,160);
      Airplane airplane = new Airplane(1911,CARGO,airport,100,120,"Boening",3000);
        System.out.println(passengerPlane.getInfo());
        System.out.println();
        System.out.println(passengerPlane2.getInfo());
        System.out.println();
        System.out.println(airplane.getInfo());
        System.out.println();
        passengerPlane.method();
        System.out.println();
        passengerPlane2.method(" Прилет в 22:30 ! ");
    }
}