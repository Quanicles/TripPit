package Flow;
import Flow.CreateTrip;
import Flow.TripState;

import java.io.InputStream;
import java.util.*;

public class Trip {
    List<String> agent;
    String id;
    ArrayList<String> travelers = new ArrayList<>();
    ArrayList<String> packages = new ArrayList<>();
    String paymentPerson;
    String paymentType ;
    double pa =0;
    double pt =0;
    double paymentStatus = 0;
    String tripCreator;
    private TripState state = new CreateTrip();

    // getter, setter
    public void setState(TripState state) {
        this.state = state;
    }

    public TripState getState() {
        return this.state;
    }

    public void previousState() {
        state.prev(this);
    }

    public void nextState() {
        state.action(this);
    }

    void action(){



        state.action(this);



    }

}
