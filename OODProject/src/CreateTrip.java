package Flow;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class CreateTrip implements TripState {
    Scanner scan = new Scanner(System.in);
    Trip test;
    TravelAgentSingleton agentSingleton;

    @Override
    public void prev(Trip t) {
        // TODO Auto-generated method stub
        System.out.println("The package is in its root state.");
    }

    @Override
    public void next(Trip t) {
        // TODO Auto-generated method stub
        t.setState(new AddTravelers());
        t.nextState();

    }

    @Override
    public void action(Trip t, List<String> agent,String id, ArrayList<String> travelers, List<String> packages,
                       ArrayList<String> paymentPerson, ArrayList<String> paymentType, double pa, int pt, int paymentStatus, String tripCreator) {

        boolean isCorrect = false;
        agent = agentSingleton.getAgents();

        // TODO Auto-generated method stub
        System.out.println("Choose an agent from the list below");
        for(int i=0; i<agent.size();i++) {
            System.out.println(agent.get(i));
        }
        System.out.print("Enter your agents name: ");
        String agentString = scan.nextLine();
        while(!isCorrect)
        {
            if(agentString.equalsIgnoreCase("Murdock"))
            {
                tripCreator = agentString;
                isCorrect = true;
            }else if ( agentString.equalsIgnoreCase("Baracus")) {
                tripCreator = agentString;
                isCorrect = true;
            }else if ( agentString.equalsIgnoreCase("Hannibal")) {
                tripCreator = agentString;
                isCorrect = true;
            }else if ( agentString.equalsIgnoreCase("Faceman")) {
                tripCreator = agentString;
                isCorrect = true;
            } else
            {
                System.out.print("Please enter a valid agent name: ");
                agentString = scan.nextLine();
            }
        }

            id = UUID.randomUUID().toString();
            System.out.println("Starting trip with id: " + id);



        next(t);




    }

}