import java.util.ArrayList;

public class Trip {
	ArrayList<String> agent = new ArrayList<String>();
	String id;
	ArrayList<java.lang.String> travelers = new ArrayList<String>();
	ArrayList<String> packages = new ArrayList<String>();
	ArrayList<String> paymentPerson = new ArrayList<String>();
	ArrayList<String> paymentType = new ArrayList<String>();
	double pa =0;
	int pt =0;
	int paymentStatus = 0;
	String tripCreator;
	String ppaying;
	private TripState state = new createTrip();
	 
    // getter, setter
	 public void setState(TripState state) {
		  this.state = state;
		 }
		 
		 public TripState getState() {
		  return this.state;
		 } 
 
    public void previousState() {
        state.prev(this);
    }
 
    public void nextState() {
        state.next(this);
    }
 
    void action(){
    	
		

		state.action(agent,id,travelers,packages,paymentPerson,paymentType, pa, pt,paymentStatus, tripCreator, ppaying);
    }
    
}
