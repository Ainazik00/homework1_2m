package org.example;

public abstract class Transport {
    private int yearOfIssue;
    private AirplaneType airplaneType;
    private Airport airport;

    public Transport(int yearOfIssue, AirplaneType airplaneType, Airport airport) {
        this.yearOfIssue = yearOfIssue;
        this.airplaneType = airplaneType;
        this.airport = airport;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public AirplaneType getAirplaneType() {
        return airplaneType;
    }

    public Airport getAirport() {
        return airport;
    }


    public String getInfo(){
        return "\nAirplaneType: " + airplaneType +
                "\nYearOfIssue: " + yearOfIssue +
                "\nAirport name: " + airport.getName() +
                "\nAirport address: " + airport.getAddress();
    }
}
