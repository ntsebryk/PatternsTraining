package patterns.gof.prototype;

import java.util.Date;

/**
 * Created by ntsebryk on 09.09.2016.
 */
public class Code implements Cloneable {
    private String pack;
    private Date lastUpdated;
    private String code;

    public String getPack() {
        return pack;
    }

    public void setPack(String pack) {
        this.pack = pack;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpadted) {
        this.lastUpdated = lastUpadted;
    }

    @Override
    public Code clone() throws CloneNotSupportedException {
        return (Code)super.clone();
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Code code1 = (Code) o;

        if (!pack.equals(code1.pack)) return false;
        if (!lastUpdated.equals(code1.lastUpdated)) return false;
        return code != null ? code.equals(code1.code) : code1.code == null;

    }*/

    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || this.getClass() != o.getClass()) return false;

        Code code1 = (Code) o;
        if(!this.code.equals(code1.code)) return false;
        return this.code != null && this.code.equals(code1.code);
    }

    @Override
    public int hashCode() {
        int result = pack.hashCode();
        result = 31 * result + lastUpdated.hashCode();
        result = 31 * result + (code != null ? code.hashCode() : 0);
        return result;
    }
}
