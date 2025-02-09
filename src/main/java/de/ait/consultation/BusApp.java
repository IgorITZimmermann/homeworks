package de.ait.consultation;

import java.time.LocalTime;

public class BusApp {

    private LocalTime startTime = LocalTime.of(6,0);
    private LocalTime endTime = LocalTime.of(23,0);

    public boolean isBusAvailable(LocalTime time){
        if(time.isAfter(startTime) && time.isBefore(endTime)){
            System.out.println("Bus is available at " + time);
            return true;
        }
        else {
            System.out.println("Bus is not available at " + time);
            return false;
        }
    }

}
