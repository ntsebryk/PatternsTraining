package patterns.gof.state;

/**
 * Created by ntsebryk on 06.10.2016.
 */
public class BigAlarm extends Alarm {


    @Override
    public void ring(final ClockContext clockContext, int alarmLevel) {
        System.out.println("GET UP! FOOL!");
        if(finishRing(clockContext.getCounter(), alarmLevel)) {
            clockContext.setAlarm(new BigAlarm());
        } else {
            clockContext.setAlarm(new SmallAlarm());
        }
    }

    public BigAlarm() {

    }
}
