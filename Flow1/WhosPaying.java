package Flow1;
import java.util.ArrayList;

public class WhosPaying implements TripState {

    @Override
    public void prev(Trip t) {
        // TODO Auto-generated method stub
        t.setState(new AddTravelers());

    }

    @Override
    public void next(Trip t) {
        // TODO Auto-generated method stub
        t.setState(new PaymentType());
        t.nextState();
    }

    @Override
    public void action(Trip t, ArrayList<String> agent, String id, ArrayList<String> travelers, ArrayList<String> packages,
                       ArrayList<String> paymentPerson, ArrayList<String> paymentType, double pa, int pt, int paymentStatus, String tripCreator) {
        // TODO Auto-generated method stub

        next(t);
    }

}