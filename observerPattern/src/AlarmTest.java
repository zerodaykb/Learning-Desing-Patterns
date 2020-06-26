import model.*;
import model.observators.*;

public class AlarmTest {
    public static void main(String[] args) {
        Alarm alarm = new Alarm();

        AlarmListener dogs = new Dogs();
        AlarmListener bars = new Bars();
        AlarmListener soundAlert = new SoundAlert();
        AlarmListener police = new Police();

        alarm.addListener(dogs);
        alarm.addListener(bars);
        alarm.addListener(soundAlert);
        alarm.addListener(police);

        AlarmScheduler alarmScheduler = new AlarmScheduler(alarm);
        alarmScheduler.run();
    }
}
