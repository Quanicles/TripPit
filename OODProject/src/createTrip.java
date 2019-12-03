import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;


public class createTrip implements TripState {
	Scanner scan = new Scanner(System.in);
	

	@Override
	public void prev(Trip t) {
		// TODO Auto-generated method stub
		System.out.println("The package is in its root state.");
	}

	@Override
	public void next(Trip t) {
		// TODO Auto-generated method stub
		t.setState(new addTravelers());
		t.action();
		
		
	}

	@Override
	public void action(ArrayList<String> agent,String id, ArrayList<String> travelers, ArrayList<String> packages,
			ArrayList<String> paymentPerson, ArrayList<String> paymentType, double pa, int pt, int paymentStatus, String tripCreator, String ppaying) {
		agent.add("Mike");
		agent.add("Toro");
		 
		Trip tr = new Trip();
		// TODO Auto-generated method stub
		System.out.println("Choose an agent from the list below");
		for(int i=0; i<agent.size();i++) {
			System.out.println(i + ". " +agent.get(i));
		}
		int c = scan.nextInt();
		if(c == 1) {
			tripCreator = "Mike";
		}
		else {
			tripCreator ="Toro";
		}
		id = UUID.randomUUID().toString();
		System.out.println("Starting trip with id: " + id);
	}
	

}
