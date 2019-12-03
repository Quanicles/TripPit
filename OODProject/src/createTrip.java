import java.util.ArrayList;


public class createTrip implements TripState {

	@Override
	public void prev(Trip t) {
		// TODO Auto-generated method stub
		System.out.println("The package is in its root state.");
	}

	@Override
	public void next(Trip t) {
		// TODO Auto-generated method stub
		t.setState(new addTravelers());
		
	}

	@Override
	public void action(ArrayList<Integer> tripid, ArrayList<String> travelers, ArrayList<String> packages,
			ArrayList<String> paymentPerson, ArrayList<String> paymentType) {
		// TODO Auto-generated method stub
		
	}

}
