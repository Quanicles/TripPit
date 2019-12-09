package Flow;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.UUID;

public class TestTrip {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Trip t = new Trip();
        ArrayList<Trip> listofTrips = new  ArrayList<Trip>();
        TravelAgentSingleton travelAgentSingleton = null;

        System.out.println("Choose an agent from the list below");
        for(int i=0; i<travelAgentSingleton.getAgents().size();i++) {
            System.out.println(travelAgentSingleton.getAgents().get(i));
        }
        System.out.print("Enter your agents name: ");
        String agentString = scan.nextLine();
        boolean isCorrect = false;
        while(!isCorrect)
        {
            if(agentString.equalsIgnoreCase("Murdock"))
            {
                isCorrect = true;
            }else if ( agentString.equalsIgnoreCase("Baracus")) {
                isCorrect = true;
            }else if ( agentString.equalsIgnoreCase("Hannibal")) {
                isCorrect = true;
            }else if ( agentString.equalsIgnoreCase("Faceman")) {
                isCorrect = true;
            } else
            {
                System.out.print("Please enter a valid agent name: ");
                agentString = scan.nextLine();
            }
        }
        int choice;
        System.out.println(" What would you like to do? \n 1) Create a trip \n 2) Show all trips that you own \n 3) load a trip \n Enter the number that corresponds to your choice");
        choice = scan.nextInt();
        if(choice == 1)
        {
            t.action();
            listofTrips.add(t);
        } else if(choice == 2)
        {

        } else if(choice == 3)
        {

        }else
        {
            System.out.println("Enter valid input");
        }
    }

}
