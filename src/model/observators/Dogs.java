package model.observators;

import model.AlarmListener;
import model.EnteredPinEvent;

public class Dogs implements AlarmListener {

    @Override
    public void alarmTurnedOn(EnteredPinEvent event) {
        System.out.println("woof woof");
    }

    @Override
    public void alarmTurnedOff(EnteredPinEvent event) {
        System.out.println("wracamy do budy");
    }
}
