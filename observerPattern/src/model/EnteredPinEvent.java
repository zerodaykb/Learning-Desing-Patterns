package model;

import java.util.Date;

public class EnteredPinEvent{
    private Alarm alarm;
    private Date eventDate;

    public EnteredPinEvent(Alarm alarm, Date eventDate) {
        this.eventDate = eventDate;
        this.alarm = alarm;
    }

    public Alarm getAlarm() {
        return alarm;
    }
}
