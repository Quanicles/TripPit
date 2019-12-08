package Flow;

import java.util.ArrayList;

public class DetailDecorator extends ItineraryDecorator {

    public DetailDecorator (Itinerary itineraryToBeDecorated, Trip tr){
        super(itineraryToBeDecorated, tr);
    }

    @Override
    public String getTrip() {
        super.getTrip();
        return getDetails();
    }

    private String getDetails() {

        ArrayList<java.lang.String> trArray = tr.travelers;

        System.out.println("Details:" + "\n");
        String details = "";
        int size = trArray.size();
   
/*   details = "Trip Details, beginning ";
   for(int i=0; i < size; i++){
   
      details = details + trArray.get(i) + "\n";
   
   }
*/
        return details;

    }

}