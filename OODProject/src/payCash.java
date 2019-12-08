package Flow;

import java.util.ArrayList;
import java.util.List;

public class payCash implements TripState {
    boolean payedinFull;
    int triptotal;

    @Override
    public void prev(Trip t) {
        // TODO Auto-generated method stub
        t.setState(new PaymentType());
    }

    @Override
    public void next(Trip t) {
        // TODO Auto-generated method stub

        t.setState(new ThankYouNote());
        t.nextState();
    }

    @Override
    public void action(Trip t, List<String> agent, String id, ArrayList<String> travelers,
                       List<String> packages, ArrayList<String> paymentPerson, ArrayList<String> paymentType, double pa,
                       int pt, int paymentStatus, String tripCreator) {
        // TODO Auto-generated method stub
        System.out.println("paying with cash");




        // logic behind pay as you go
        if(pa != triptotal) {
            payedinFull = false;
            System.out.println("You're Trip is not paid in full. You must pay as you go.");
        }
        next(t);

    }

}