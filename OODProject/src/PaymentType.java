package Flow;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PaymentType implements TripState {
    Scanner scan = new Scanner(System.in);
    int ptype;
    @Override
    public void prev(Trip t) {
        // TODO Auto-generated method stub
        t.setState(new WhosPaying());
    }

    @Override
    public void next(Trip t) {
        // TODO Auto-generated method stub
        if(ptype == 1) {
            t.setState(new payCash());
        }
        else {
            t.setState(new payCheck());
        }
        t.nextState();

    }

    @Override
    public void action(Trip t, List<String> agent, String id, ArrayList<String> travelers, List<String> packages,
                       ArrayList<String> paymentPerson, ArrayList<String> paymentType, double pa, int pt, int paymentStatus, String tripCreator) {
        // TODO Auto-generated method stub

        //prompt user to select payment type
        System.out.println("Enter your payment type. \n1 for cash \n2 for check");
        ptype = scan.nextInt();
        next(t);
    }

}