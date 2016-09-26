package patterns.gof.bridge;

/**
 * Created by DaNiEJIb on 11/09/2016.
 */
public abstract class Phone {
    private PhoneAPI phoneAPI;

    public Phone(PhoneAPI phoneAPI) {
        this.phoneAPI = phoneAPI;
    }

    public long getPhoneIME() {
        return phoneAPI.getIMEI();
    }
}
