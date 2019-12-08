package Flow;
import java.util.ArrayList;

public class SimpleItinerary implements Itinerary {

    protected Itinerary itiner;
    protected Trip tr;

    public SimpleItinerary(Itinerary itiner, Trip tr){

        this.itiner = itiner;
        this.tr = tr;
    }

    @Override
    public String getTrip() {
        String str = "1";
        return str;
    }


}