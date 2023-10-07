package org.example;

public final class Airplane extends PassengerPlane {
    private String model;
    private int maxSpeed;

    public Airplane(int yearOfIssue, AirplaneType airplaneType, Airport airport, int people, int places, String model, int maxSpeed) {
        super(yearOfIssue, airplaneType, airport, people, places);
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nmodel: " + model +
                "\nmaxSpeed: " + maxSpeed;
    }
}
