package model.observators;

import model.EnteredPinEvent;
import model.Listener;

public class SoundAlert extends Listener {

    @Override
    public void alarmTurnedOn(EnteredPinEvent event) {
        System.out.println("łiiiiiooo łiiiiiooo");
    }

    @Override
    public void alarmTurnedOff(EnteredPinEvent event) {
        System.out.println("sssssssszzz <szum wiatru>");
    }
}
