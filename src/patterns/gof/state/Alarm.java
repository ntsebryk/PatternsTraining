package patterns.gof.state;

/**
 * Created by ntsebryk on 06.10.2016.
 */
public abstract class Alarm {

    protected boolean finishRing(int counter, int alarmLevel) {
        return counter%alarmLevel == 0;
    }
    public abstract void ring(ClockContext clockContext, int alarmLevel);
}
