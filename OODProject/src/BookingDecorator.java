import java.util.ArrayList;

public class BookingDecorator extends ItineraryDecorator {
	   
   public BookingDecorator (Itinerary itineraryToBeDecorated, Trip tr){
      super(itineraryToBeDecorated, tr);
   }
   
   @Override
   public String getTrip() {
      super.getTrip();
      contactInfo();
      return contactInfo();
   }

   private String contactInfo() {
      String contact = "";

      return contact;
   }

}
