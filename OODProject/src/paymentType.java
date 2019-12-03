import java.util.ArrayList;

public class paymentType implements TripState {

	@Override
	public void prev(Trip t) {
		// TODO Auto-generated method stub
		t.setState(new whosPaying());
	}

	@Override
	public void next(Trip t) {
		// TODO Auto-generated method stub
		t.setState(new thankYouNote());

	}

	@Override
	public void action(ArrayList<String> agent, String id, ArrayList<String> travelers, ArrayList<String> packages,
			ArrayList<String> paymentPerson, ArrayList<String> paymentType, double pa, int pt, int paymentStatus, String tripCreator) {
		// TODO Auto-generated method stub

	}

}
