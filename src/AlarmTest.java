import model.Alarm;
import model.AlarmScheduler;
import model.Listener;
import model.observators.Bars;
import model.observators.Dogs;
import model.observators.Police;
import model.observators.SoundAlert;

public class AlarmTest {
    public static void main(String[] args) {
        Alarm alarm = new Alarm();

        Listener dogs = new Dogs();
        Listener bars = new Bars();
        Listener soundAlert = new SoundAlert();
        Listener police = new Police();

        alarm.addListener(dogs);
        alarm.addListener(bars);
        alarm.addListener(soundAlert);
        alarm.addListener(police);

        AlarmScheduler alarmScheduler = new AlarmScheduler(alarm);
        alarmScheduler.run();
    }
}
