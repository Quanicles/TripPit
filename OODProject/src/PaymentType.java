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
        else if(ptype == 2){
            t.setState(new payCheck());
        } else
            t.setState(new payCard());
        t.nextState();

    }

    @Override
    public void action(Trip t) {
        // TODO Auto-generated method stub

        //prompt user to select payment type
        System.out.println("Enter your payment type. \n1 for cash \n2 for check \n 3 for credit");
        ptype = scan.nextInt();
        if(ptype == 1)
            t.paymentType = "cash";
        else if(ptype == 2)
            t.paymentType = "check";
        else if(ptype == 3)
            t.paymentType = "credit";

        next(t);
    }

}