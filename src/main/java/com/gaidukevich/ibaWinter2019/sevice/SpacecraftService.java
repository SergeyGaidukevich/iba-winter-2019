package com.gaidukevich.ibaWinter2019.sevice;

import com.gaidukevich.ibaWinter2019.entity.Spacecraft;
import org.springframework.context.ApplicationContext;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class SpacecraftService {
    public static Spacecraft chooseSpacecraft(ApplicationContext context) {
        int shuttleNumber = new Random().nextInt(1) + 1;
        String shuttleBeanName = "spacecraft" + shuttleNumber;
        return (Spacecraft) context.getBean(shuttleBeanName);
    }

    public static void startSpacecraft() {
        // start thread (wait 10sec(1 2 3 ... GO!) => emulation start print (km))
        int preparedSecond = 0;
        Timer timer = new Timer();
        System.out.println("Prepared!");
        for (int i = 0; i < 10; i++) {
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    System.out.println("!!-" + preparedSecond + "-!!");
                }
            }, 100);
            timer.purge();
        }

        System.out.println("Start");
        EmulationService.emulationTrip();
        System.out.println("Finish");
    }

}
