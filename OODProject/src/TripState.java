package Flow;

import java.util.ArrayList;
import java.util.List;

public interface TripState {


    void prev(Trip t);
    void next(Trip t);
    void action(Trip t, List<String> agent, String id, ArrayList<String> travelers, List<String> packages,
                ArrayList<String> paymentPerson, ArrayList<String> paymentType, double pa, int pt, int paymentStatus, String tripCreator);
}