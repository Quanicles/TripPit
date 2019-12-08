package Flow;
import Flow.CreateTrip;
import Flow.TripState;

import java.util.*;

public class Trip {
    List<String> agent;
    String id;
    ArrayList<String> travelers;
    List<String> packages;
    ArrayList<String> paymentPerson = new ArrayList<String>();
    ArrayList<String> paymentType = new ArrayList<String>();
    double pa =0;
    int pt =0;
    int paymentStatus = 0;
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
        state.action(this, agent,id,travelers,packages,paymentPerson,paymentType, pa, pt,paymentStatus, tripCreator);
    }

    void action(){



        state.action(this, agent,id,travelers,packages,paymentPerson,paymentType, pa, pt,paymentStatus, tripCreator);



    }

}
