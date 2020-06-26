package model;

import java.util.ArrayList;
import java.util.Date;

public class Alarm {
    private ArrayList<AlarmListener> alarmListeners = new ArrayList<>();
    private final static String pin = "1234";

    public void addListener(AlarmListener listener) {
        alarmListeners.add(listener);
    }

    public void removeListener(AlarmListener listener) {
        alarmListeners.remove(listener);
    }

    public void enterPin(String pinEntered) {
        EnteredPinEvent event = new EnteredPinEvent(this, new Date());

        if(pin.equals(pinEntered)) {
            correctEnteredPin(event);
        } else {
            wrongEnteredPin(event);
        }
    }

    private void wrongEnteredPin(EnteredPinEvent event) {
        for(AlarmListener listener: alarmListeners) {
            listener.alarmTurnedOn(event);
        }
    }

    private void correctEnteredPin(EnteredPinEvent event) {
        for(AlarmListener listener: alarmListeners) {
            listener.alarmTurnedOff(event);
        }
    }
}
