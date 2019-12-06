package Flow1;
import java.util.ArrayList;
import java.util.Scanner;

public class AddPackages implements TripState {
	Scanner scan = new Scanner(System.in);

    @Override
    public void prev(Trip t) {
        // TODO Auto-generated method stub
        t.setState(new AddTravelers());

    }

    @Override
    public void next(Trip t) {
        // TODO Auto-generated method stub
        t.setState(new WhosPaying());
        t.nextState();

    }

    @Override
    public void action(Trip t, ArrayList<String> agent, String id, ArrayList<String> travelers, ArrayList<String> packages,
                       ArrayList<String> paymentPerson, ArrayList<String> paymentType, double pa, int pt, int paymentStatus, String tripCreator) {
        // TODO Auto-generated method stub
    	
    	String addPackage = "yes"; 
    	while(!addPackage.equalsIgnoreCase("done")) {
    	//Prompt user for departure location
    	System.out.println("Enter departure location: ");
    	String depart = scan.nextLine();
    	packages.add(depart);
    	//Prompt user for destination location
    	System.out.println("Enter destination location: ");
    	scan.nextLine();
    	String destination = scan.nextLine();
    	//Ask user if they would like to enter another package
    	System.out.println("Would you like to add another package to this order? \nEnter Yes if you would, done if you're finished and later to save this trip.");
    	addPackage = scan.nextLine();
    	
    	if(addPackage.equalsIgnoreCase("later")) {
    		break;
    	}
    	}
    	
    	 if(addPackage.equalsIgnoreCase("done")) {
    		 if(packages.size() > 1) {
    	        next(t);
    		 }
    		 else {
    			 System.out.println("you need to add a package before you can continue");
    			 t.action();
    		 }
    	}
    	        
    	        // change to implementation for write factor here
    	        else if(addPackage.equalsIgnoreCase("later")) {
    	        	System.out.println("Saving trip " + id + " for later");
    	        }

    }

}