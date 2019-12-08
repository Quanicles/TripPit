package Flow;

import java.util.ArrayList;
import java.util.List;


public class ThankYouNote implements TripState {

    @Override
    public void prev(Trip t) {
        // TODO Auto-generated method stub
        t.setState(new PaymentType());
    }

    @Override
    public void next(Trip t) {
        // TODO Auto-generated method stub
        System.out.println("This trip has already been scheduled.");
    }

    @Override
    public void action(Trip t, List<String> agent, String id, ArrayList<String> travelers, List<String> packages,
                       ArrayList<String> paymentPerson, ArrayList<String> paymentType, double pa, int pt, int paymentStatus, String tripCreator) {
        // TODO Auto-generated method stub

        System.out.println("You're trip has now been schedule \n Youe will be traveling to blank from blank."
                + "\n With (list people on the trip). \n Your trip total is $ and is payedinfull.");


        next(t);
    }

}