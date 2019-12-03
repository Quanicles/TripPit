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
		t.nextState();
		
		
	}

	@Override
	public void action(ArrayList<String> agent, String id, ArrayList<String> travelers, ArrayList<String> packages,
			ArrayList<String> paymentPerson, ArrayList<String> paymentType, double pa, int pt, int paymentStatus, String tripCreator, String ppaying) {
		// TODO Auto-generated method stub
		//Add Travelers
		System.out.println("Enter the name of the people travelling with you. Enter \"done\"  when you're finished.");
		String person = scan.nextLine();
		
		while(!person.equals("done")) {
			travelers.add(person);
			person = scan.nextLine();
			//logic for writer
			if(person.equals("later")) {
				
			}
		}
		for(String trav: travelers) {
			System.out.println(trav);
		}
		
	}

}
