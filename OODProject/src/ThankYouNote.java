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
        String[] arguments = new String[] {"123"};
        TestTrip.main(arguments);
    }

    @Override
    public void action(Trip t) {
        // TODO Auto-generated method stub

        System.out.print("You're trip has now been schedule\n You will be traveling ");
        for(int i = 0; i< t.packages.size(); i++)
        {
            System.out.print(t.packages.get(i) + "; ");
        }
       System.out.print(" With ");
        for(int i = 0; i< t.travelers.size(); i++)
        {
            System.out.print(t.travelers.get(i));
        }
        System.out.print("\n Your trip total is $" + t.pt + " and you have paid $" + t.pa + "\n");


        next(t);
    }

}