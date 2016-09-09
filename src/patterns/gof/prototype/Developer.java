package patterns.gof.prototype;

import java.util.Date;

/**
 * Created by ntsebryk on 09.09.2016.
 */
public class Developer {
    private String name;

    public Developer(String name) {
        this.name = name;
    }

    public Code createCode(String code, String pack) {
        Code codeInstance = new Code();
        codeInstance.setCode(code);
        codeInstance.setPack(pack);
        codeInstance.setLastUpdated(new Date());
        return codeInstance;
    }

    public Code copyCode(Code code) {
        Code temp = null;
        try {
            temp = code.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return temp;
    }
}
