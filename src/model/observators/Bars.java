package model.observators;

import model.EnteredPinEvent;
import model.Listener;

public class Bars extends Listener {
    @Override
    public void alarmTurnedOn(EnteredPinEvent event) {
        System.out.println("Grrrraach!");
    }

    @Override
    public void alarmTurnedOff(EnteredPinEvent event) {
        System.out.println("zzzz");
    }
}
