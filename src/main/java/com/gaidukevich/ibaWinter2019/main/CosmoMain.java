package com.gaidukevich.ibaWinter2019.main;

import com.gaidukevich.ibaWinter2019.entity.Spacecraft;
import com.gaidukevich.ibaWinter2019.entity.Trip;
import com.gaidukevich.ibaWinter2019.sevice.CosmoTripService;
import com.gaidukevich.ibaWinter2019.sevice.SpacecraftService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CosmoMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Spacecraft spacecraft = SpacecraftService.chooseSpacecraft(context);
        Trip trip = CosmoTripService.getTrip(context, spacecraft);
        SpacecraftService.startSpacecraft();
    }
}
