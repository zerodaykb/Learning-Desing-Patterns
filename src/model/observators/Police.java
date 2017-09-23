package model.observators;

import model.EnteredPinEvent;
import model.Listener;

public class Police extends Listener {

    @Override
    public void alarmTurnedOn(EnteredPinEvent event) {
        System.out.println("Jedziemy");
    }

    @Override
    public void alarmTurnedOff(EnteredPinEvent event) {
        System.out.println("Jemy pączki");
    }
}
