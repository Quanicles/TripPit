import java.util.ArrayList;

public abstract class ItineraryDecorator implements Itinerary {
	
   protected Itinerary itineraryToBeDecorated;
   protected Trip tr;
   
   public ItineraryDecorator(Itinerary itineraryToBeDecorated, Trip tr){
      this.itineraryToBeDecorated = itineraryToBeDecorated;
      this.tr = tr;
   }   
   
   @Override
   public String getTrip() {
   
   String str = "1";
   return str;
   
   }

}
