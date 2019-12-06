package Flow1;

import java.util.ArrayList;

public class payCash implements TripState {
	boolean payedinFull;
	int triptotal;

	@Override
	public void prev(Trip t) {
		// TODO Auto-generated method stub
		t.setState(new PaymentType());
	}

	@Override
	public void next(Trip t) {
		// TODO Auto-generated method stub
		
        t.nextState();
        t.setState(new ThankYouNote());
	}

	@Override
	public void action(Trip t, ArrayList<String> agent, String id, ArrayList<String> travelers,
			ArrayList<String> packages, ArrayList<String> paymentPerson, ArrayList<String> paymentType, double pa,
			int pt, int paymentStatus, String tripCreator) {
		// TODO Auto-generated method stub
		System.out.println("paying with cash");
		
		//Use program flow 2 to collect payment 
		
		// logic behind pay as you go
		if(pa != triptotal) {
			payedinFull = false;
			System.out.println("You're Trip is not paid in full. You must pay as you go.");
		}
		next(t);

	}

}
