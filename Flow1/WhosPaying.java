package Flow1;
import java.util.ArrayList;
import java.util.Scanner;

public class WhosPaying implements TripState {
	Scanner scan = new Scanner(System.in);
    @Override
    public void prev(Trip t) {
        // TODO Auto-generated method stub
        t.setState(new AddPackages());

    }

    @Override
    public void next(Trip t) {
        // TODO Auto-generated method stub
        t.setState(new PaymentType());
        t.nextState();
    }

    @Override
    public void action(Trip t, ArrayList<String> agent, String id, ArrayList<String> travelers, ArrayList<String> packages,
                       ArrayList<String> paymentPerson, ArrayList<String> paymentType, double pa, int pt, int paymentStatus, String tripCreator) {
        // TODO Auto-generated method stub
    	
    	System.out.println("Select the person responsible for paying from the list below: ");
    	
    	//replace with the singleton class
    	for(String traveler: travelers) {
    		System.out.println(traveler);
    	}
    	String personPaying= scan.next();
    	
    	//checks that someone is paying before moving to the next state;
    	if(travelers.contains(personPaying)) {
    		next(t);	
    	}
    	// Saves to write Strategy class
    	else if(personPaying.equalsIgnoreCase("later")){
    		System.out.println("Saving your trip to be continued later.");
    	}
    	else {
    		System.out.println("You have not selected anyone one to pay.");
    		t.action();
    	}
    	

        
    }

}