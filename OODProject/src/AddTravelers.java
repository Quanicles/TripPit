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
    public void action(Trip t) {
        // TODO Auto-generated method stub

        PersonSingleton personSingleton = null;
        boolean isCorrect = false;

        List<String> currentPeople = personSingleton.getPeople();
        
        for(int i = 0; i < currentPeople.size(); i++)
        {
            System.out.println(currentPeople.get(i));
        }
        //Add Travelers
        System.out.println("Enter the name of the people travelling with you. Enter \"done\"  when you're finished.");
        String person = scan.nextLine();


        while(!person.equalsIgnoreCase("done") ) {
            while(!isCorrect)
            {
                for(int i = 0; i < currentPeople.size(); i++)
                {
                    if(person.equalsIgnoreCase(currentPeople.get(i)))
                    {
                        isCorrect = true;
                    }

                }
                if(!isCorrect) {
                    System.out.println("Please enter a valid name from the list provided");
                    person = scan.nextLine();
                }
            }
            t.travelers.add(person);
            person = scan.nextLine();
            isCorrect = false;
            if(person.equalsIgnoreCase("later")) {
                break;
            }
          }

            next(t);
    }

}