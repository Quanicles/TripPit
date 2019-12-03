import java.util.ArrayList;

public interface TripState {
	
	void prev(Trip t);
	void next(Trip t); 
	void action(ArrayList<Integer> tripid, ArrayList<String> travelers, ArrayList<String> packages,
			ArrayList<String> paymentPerson,ArrayList<String> paymentType);
}