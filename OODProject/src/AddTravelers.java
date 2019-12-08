package Flow;

import java.util.ArrayList;

import java.util.List;
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
    public void action(Trip t, List<String> agent, String id, ArrayList<String> travelers, List<String> packages,
                       ArrayList<String> paymentPerson, ArrayList<String> paymentType, double pa, int pt, int paymentStatus, String tripCreator) {
        // TODO Auto-generated method stub

        PersonSingleton personSingleton = null;

        List<String> currentPeople = personSingleton.getPeople();
        
        for(int i = 0; i < currentPeople.size(); i++)
        {
            System.out.println(currentPeople.get(i));
        }
        //Add Travelers
        System.out.println("Enter the name of the people travelling with you. Enter \"done\"  when you're finished.");
        String person = scan.nextLine();

        while(!person.equalsIgnoreCase("done") ) {
            travelers.add(person);
            person = scan.nextLine();
            if(person.equalsIgnoreCase("later")) {
                break;
            }
        }
        if(person.equalsIgnoreCase("done")) {
            next(t);
        }

        // change to implementation for write factor here
        else if(person.equalsIgnoreCase("later")) {
            System.out.println("Saving trip " + id + " for later");
        }

    }

}