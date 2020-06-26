package model;

public interface AlarmListener {
    void alarmTurnedOn(EnteredPinEvent event);
    void alarmTurnedOff(EnteredPinEvent event);
}
