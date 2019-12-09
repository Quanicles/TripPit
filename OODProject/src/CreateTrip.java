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
    public void action(Trip t){
        t.id = UUID.randomUUID().toString();
        System.out.println("Starting trip with id: " + t.id);

        next(t);

    }

}