import java.util.ArrayList;
import java.util.Scanner;

public class whosPaying implements TripState {
	Scanner scan = new Scanner(System.in);
	
	@Override
	public void prev(Trip t) {
		// TODO Auto-generated method stub
		t.setState(new addTravelers());

	}

	@Override
	public void next(Trip t) {
		// TODO Auto-generated method stub
		t.setState(new paymentType());
	}

	@Override
	public void action(ArrayList<String> agent, String id, ArrayList<String> travelers, ArrayList<String> packages,
			ArrayList<String> paymentPerson, ArrayList<String> paymentType, double pa, int pt, int paymentStatus, String tripCreator, String ppaying) {
		// TODO Auto-generated method stub
		
		System.out.println("Select the person paying from the list below");
		for(int i=0; i<paymentPerson.size();i++) {
			System.out.println(i + ". " +paymentPerson.get(i));
		}
		int paying = scan.nextInt();
		
		ppaying = paymentPerson.get(paying);
		
		//user enter later write to factory
	}

}
