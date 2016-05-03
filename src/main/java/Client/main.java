package Client;

import Airport.Airport;
import Flight.CargoFlight;
import Flight.LineFlight;
import Flight.Flight;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by tzhweda9 on 26/04/16.
 */
public class main {

    public static void main(String[] args) {

        // Create some flights
        Collection<Flight> flights = new ArrayList<Flight>();
        flights.add(new CargoFlight("cargo-1", "cargo-bus-1"));
        flights.add(new LineFlight("line-1", "line-bus-1"));
        flights.add(new CargoFlight("cargo-2", "cargo-bus-2"));
        flights.add(new LineFlight("line-2", "line-bus-2"));

        // Create airport
        Airport airport = new Airport(flights);

        airport.proceedFlight();

    }

}
