package Flow;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class payCard implements TripState {
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
        // TODO Auto-generated method stub

        t.setState(new ThankYouNote());
        t.nextState();
    }

    @Override
    public void action(Trip t) {
        // TODO Auto-generated method stub
        int number, date, cvs;
        System.out.println(t.paymentPerson + " you owe " + t.pt + " and will be paying in Card. \n Enter Card number");
        number = scan.nextInt();
        System.out.println("Enter card expiration date.");
        date = scan.nextInt();
        System.out.println("Enter cvs code.");
        cvs = scan.nextInt();

        System.out.println("Card approved. You owe $" + t.pt + " how much will you be paying?");
        t.pa = scan.nextDouble();

        t.paymentStatus = t.pa;
        // logic behind pay as you go
        if (t.pa != t.pt) {
            payedinFull = false;
            System.out.println("You're Trip is not paid in full. You must pay as you go.");
        }
        next(t);

    }

}