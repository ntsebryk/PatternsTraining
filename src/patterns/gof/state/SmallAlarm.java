package patterns.gof.state;

/**
 * Created by ntsebryk on 06.10.2016.
 */
public class SmallAlarm extends Alarm{
    @Override
    public void ring(final ClockContext clockContext,int alarmLevel) {
        System.out.println("Please! Get Up");
        if(finishRing(clockContext.getCounter(), alarmLevel)) {
            clockContext.setAlarm(new BigAlarm());
        } else {
            clockContext.setAlarm(new SmallAlarm());
        }
    }
}
