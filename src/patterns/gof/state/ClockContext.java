package patterns.gof.state;

/**
 * Created by ntsebryk on 06.10.2016.
 */
public class ClockContext {
    private Alarm alarm;
    private int alarmLevel;
    private int duration;
    private int counter = 1;

    public int getCounter() {
        return counter;
    }

    public void setAlarm(Alarm alarm) {
        this.alarm = alarm;
    }

    public ClockContext(int alarmLevel, int duration) {
        alarm = new SmallAlarm();
        this.alarmLevel = alarmLevel;
        this.duration = duration;
    }

    public void ring() {
        while (counter++ <= duration) {
            alarm.ring(this, alarmLevel);
        }
    }
}
