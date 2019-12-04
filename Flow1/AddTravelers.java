package Flow1;
import java.util.ArrayList;

import java.util.Scanner;

public class AddTravelers implements TripState {
    Scanner scan = new Scanner(System.in);

    @Override
    public void prev(Trip t) {
        // TODO Auto-generated method stub
        t.setState(new CreateTrip());
    }

    @Override
    public void next(Trip t) {
        // TODO Auto-generated method stub
        t.setState(new AddPackages());
        t.nextState();

    }

    @Override
    public void action(Trip t, ArrayList<String> agent, String id, ArrayList<String> travelers, ArrayList<String> packages,
                       ArrayList<String> paymentPerson, ArrayList<String> paymentType, double pa, int pt, int paymentStatus, String tripCreator) {
        // TODO Auto-generated method stub

        //Add Travelers
        System.out.println("Enter the name of the people travelling with you. Enter \"done\"  when you're finished.");
        String person = scan.nextLine();

        while(!person.equalsIgnoreCase("done")) {
            travelers.add(person);
            person = scan.nextLine();
        }
        next(t);

    }

}