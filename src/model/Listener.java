package model;

public abstract class Listener implements AlarmListener {

    public abstract void alarmTurnedOn(EnteredPinEvent enteredPinEvent);
    public abstract void alarmTurnedOff(EnteredPinEvent enteredPinEvent);

}
