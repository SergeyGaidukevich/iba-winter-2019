package com.gaidukevich.ibaWinter2019.sevice;

import com.gaidukevich.ibaWinter2019.entity.Astronaut;
import com.gaidukevich.ibaWinter2019.entity.Spacecraft;
import com.gaidukevich.ibaWinter2019.entity.Trip;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class CosmoTripService {
    public static Trip getTrip(ApplicationContext context, Spacecraft spacecraft) {
        //generates and returns information about the upcoming trip
        Trip trip = new Trip();

        List<Astronaut> astronauts = (List<Astronaut>) context.getBean("astronauts");
        List<String> foods = new ArrayList<>();
        foods.add("apple");
        foods.add("carrot");

        trip.setCrew(astronauts);
        trip.setOnboardFoods(foods);
        trip.setPlaceArrival("earth");
        trip.setPlaceDeparture("Moon");
        trip.setShuttle(spacecraft);
        trip.setType("tourist");
        System.out.println(trip);

        return trip;
    }
}
