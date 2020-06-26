package model.observators;

import model.AlarmListener;
import model.EnteredPinEvent;

public class Police implements AlarmListener {

    @Override
    public void alarmTurnedOn(EnteredPinEvent event) {
        System.out.println("Jedziemy");
    }

    @Override
    public void alarmTurnedOff(EnteredPinEvent event) {
        System.out.println("Jemy pączki");
    }
}
