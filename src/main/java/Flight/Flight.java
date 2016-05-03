package Flight;

/**
 * Created by tzhweda9 on 26/04/16.
 */
public abstract class Flight {

    protected String name;
    protected String type;

    protected Flight(String name, String type) {
        this.name = name;
        this.type = type;
    }

    abstract public void doYourStuff();
}
