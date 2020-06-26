package model.observators;

import model.AlarmListener;
import model.EnteredPinEvent;

public class SoundAlert implements AlarmListener {

    @Override
    public void alarmTurnedOn(EnteredPinEvent event) {
        System.out.println("łiiiiiooo łiiiiiooo");
    }

    @Override
    public void alarmTurnedOff(EnteredPinEvent event) {
        System.out.println("sssssssszzz <szum wiatru>");
    }
}
