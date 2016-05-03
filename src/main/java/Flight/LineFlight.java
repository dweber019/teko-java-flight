package Flight;

/**
 * Created by tzhweda9 on 03/05/16.
 */
public class LineFlight extends Flight {

    public LineFlight(String name, String type) {
        super(name, type);
    }

    public void doYourStuff() {
        System.out.println(name + " -------------------");
        System.out.println("go to tanke");
        System.out.println("go to gate");
        System.out.println("start flight with " + type);
    }
}
