package Flow1;
import java.util.ArrayList;

public interface TripState {


    void prev(Trip t);
    void next(Trip t);
    void action(Trip t, ArrayList<String> agent,String id, ArrayList<String> travelers, ArrayList<String> packages,
                ArrayList<String> paymentPerson,ArrayList<String> paymentType, double pa, int pt, int paymentStatus, String tripCreator);
}