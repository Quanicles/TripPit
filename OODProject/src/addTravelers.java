import java.util.ArrayList;

import java.util.Scanner;

public class addTravelers implements TripState {
Scanner scan = new Scanner(System.in);
	
	@Override
	public void prev(Trip t) {
		// TODO Auto-generated method stub
		t.setState(new createTrip());
	}

	@Override
	public void next(Trip t) {
		// TODO Auto-generated method stub
		t.setState(new addPacakges());
		
	}

	@Override
	public void action(ArrayList<String> agent, String id, ArrayList<String> travelers, ArrayList<String> packages,
			ArrayList<String> paymentPerson, ArrayList<String> paymentType, double pa, int pt, int paymentStatus, String tripCreator) {
		// TODO Auto-generated method stub
		
		//Add Travelers
		System.out.println("Enter the name of the people travelling with you. Enter \"done\"  when you're finished.");
		String person = scan.nextLine();
		
		while(person != "done") {
			travelers.add(person);
			person = scan.nextLine();
		}
		
	}

}
