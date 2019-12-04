package Flow1;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;


public class CreateTrip implements TripState {
    Scanner scan = new Scanner(System.in);
    Trip test;

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
    public void action(Trip t, ArrayList<String> agent,String id, ArrayList<String> travelers, ArrayList<String> packages,
                       ArrayList<String> paymentPerson, ArrayList<String> paymentType, double pa, int pt, int paymentStatus, String tripCreator) {
        agent.add("Mike");
        agent.add("Toro");

        // TODO Auto-generated method stub
        System.out.println("Choose an agent from the list below");
        for(int i=0; i<agent.size();i++) {
            System.out.println(i + ". " +agent.get(i));
        }
        System.out.print("Enter the number that corresponds to your agent: ");
        int c = scan.nextInt();
        if(c == 1) {
            tripCreator = "Mike";
        }
        else {
            tripCreator ="Toro";
        }
        id = UUID.randomUUID().toString();
        System.out.println("Starting trip with id: " + id);

        next(t);




    }

}