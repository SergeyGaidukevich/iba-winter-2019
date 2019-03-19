package com.gaidukevich.ibaWinter2019.entity;

import java.util.List;
import java.util.Objects;

public class Trip {
    private Spacecraft shuttle;
    private List<Astronaut> crew;
    private List<String> onboardFoods;
    private String type;
    private String placeDeparture;
    private String placeArrival;

    public Trip() {
    }

    public Trip(Spacecraft shuttle, List<Astronaut> crew, List<String> onboardFoods, String type, String placeDeparture, String placeArrival) {
        this.shuttle = shuttle;
        this.crew = crew;
        this.onboardFoods = onboardFoods;
        this.type = type;
        this.placeDeparture = placeDeparture;
        this.placeArrival = placeArrival;
    }

    public Spacecraft getShuttle() {
        return shuttle;
    }

    public void setShuttle(Spacecraft shuttle) {
        this.shuttle = shuttle;
    }

    public List<Astronaut> getCrew() {
        return crew;
    }

    public void setCrew(List<Astronaut> crew) {
        this.crew = crew;
    }

    public List<String> getOnboardFoods() {
        return onboardFoods;
    }

    public void setOnboardFoods(List<String> onboardFoods) {
        this.onboardFoods = onboardFoods;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPlaceDeparture() {
        return placeDeparture;
    }

    public void setPlaceDeparture(String placeDeparture) {
        this.placeDeparture = placeDeparture;
    }

    public String getPlaceArrival() {
        return placeArrival;
    }

    public void setPlaceArrival(String placeArrival) {
        this.placeArrival = placeArrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trip trip = (Trip) o;
        return Objects.equals(shuttle, trip.shuttle) &&
                Objects.equals(crew, trip.crew) &&
                Objects.equals(onboardFoods, trip.onboardFoods) &&
                Objects.equals(type, trip.type) &&
                Objects.equals(placeDeparture, trip.placeDeparture) &&
                Objects.equals(placeArrival, trip.placeArrival);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shuttle, crew, onboardFoods, type, placeDeparture, placeArrival);
    }

    @Override
    public String toString() {
        return "Trip{" +
                "shuttle=" + shuttle +
                ", crew=" + crew +
                ", onboardFoods=" + onboardFoods +
                ", type='" + type + '\'' +
                ", placeDeparture='" + placeDeparture + '\'' +
                ", placeArrival='" + placeArrival + '\'' +
                '}';
    }
}
