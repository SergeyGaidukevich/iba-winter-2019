package com.gaidukevich.ibaWinter2019.sevice;

public class EmulationService {
    private static int countKilometers;

    public static void emulationTrip() {
        // print kilometers
        for (int i = 0; countKilometers < 63; i++) {
            System.out.println("Kilometer traveled = " + countKilometers++);
        }
    }
}
