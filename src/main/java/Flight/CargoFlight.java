package Flight;

/**
 * Created by tzhweda9 on 26/04/16.
 */
public class CargoFlight extends Flight {

    public CargoFlight(String name, String type) {
        super(name, type);
    }

    public void doYourStuff() {
        System.out.println(name + " -------------------");
        System.out.println("go to tanke");
        System.out.println("go to DHL");
        System.out.println("start flight with " + type);
    }
}
