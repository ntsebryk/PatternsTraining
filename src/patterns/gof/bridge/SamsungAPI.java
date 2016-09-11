package patterns.gof.bridge;

/**
 * Created by DaNiEJIb on 11/09/2016.
 */
public class SamsungAPI implements PhoneAPI {
    @Override
    public long getIMEI() {
        return 43623623562352L;
    }
}
