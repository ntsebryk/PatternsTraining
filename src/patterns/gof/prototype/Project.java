package patterns.gof.prototype;

/**
 * Created by ntsebryk on 09.09.2016.
 */
public class Project {
    public void doWork() {
        Developer dev1 = new Developer("John");
        Code origCode = dev1.createCode("some code", "default");

        Developer dev2 = new Developer("Abshishek");
        Code stolenCode = dev2.copyCode(origCode);

        if(origCode.equals(stolenCode) && origCode != stolenCode) {
            System.out.println("Lazy Developer Exists Watch out!");
        }
    }
}
