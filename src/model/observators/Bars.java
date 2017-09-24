package model.observators;

import model.AlarmListener;
import model.EnteredPinEvent;

public class Bars implements AlarmListener {
    @Override
    public void alarmTurnedOn(EnteredPinEvent event) {
        System.out.println("Grrrraach!");
    }

    @Override
    public void alarmTurnedOff(EnteredPinEvent event) {
        System.out.println("zzzz");
    }
}
