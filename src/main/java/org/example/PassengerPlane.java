package org.example;

public class PassengerPlane extends Transport {
    private int people;
    private int places;

    public PassengerPlane(int yearOfIssue, AirplaneType airplaneType, Airport airport, int people, int places) {
        super(yearOfIssue, airplaneType, airport);
        this.people = people;
        this.places = places;
    }

    public int getPeople() {
        return people;
    }

    public int getPlaces() {
        return places;
    }

    public final  void method() {
        System.out.println(" Вылет из аэропорта в 8:00 утра ! ");
    }

    public void method(String method) {
        System.out.println(method);
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\npeople: " + people +
                "\nplaces: " + places ;
    }
}


