package Flow;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class payCheck implements TripState {
    boolean payedinFull;
    int triptotal;
    Scanner scan = new Scanner(System.in);
    @Override
    public void prev(Trip t) {
        // TODO Auto-generated method stub
        t.setState(new PaymentType());

    }

    @Override
    public void next(Trip t) {
        t.setState(new ThankYouNote());
        t.nextState();

    }

    @Override
    public void action(Trip t) {
        // TODO Auto-generated method stub
        int checknumber;
        System.out.println("paying with Check");
        System.out.println("Enter Check number: ");
        checknumber = scan.nextInt();

        System.out.println("Check approved. You owe $" + t.pt + " how much will you be paying?");
        t.pa = scan.nextDouble();

        t.paymentStatus = t.pa;
        // logic behind pay as you go
        if(t.pa != triptotal) {
            payedinFull = false;
            System.out.println("You're Trip is not paid in full. You must pay as you go.");
        }
        next(t);

    }

}