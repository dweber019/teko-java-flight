package Airport;

import Flight.Flight;

import java.util.Collection;
import java.util.Iterator;

/**
 * Created by tzhweda9 on 03/05/16.
 */
public class Airport {

    private Collection<Flight> flights;

    public Airport(Collection<Flight> flights) {
        this.flights = flights;
    }

    public void proceedFlight() {
        for (Flight f : flights) {
            f.doYourStuff();
        }
    }


}
