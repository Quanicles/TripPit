package Flow;

import java.util.ArrayList;

public class BillingDecorator extends ItineraryDecorator {

    public BillingDecorator (Itinerary itineraryToBeDecorated, Trip tr){
        super(itineraryToBeDecorated, tr);
    }

    @Override
    public String getTrip() {
        super.getTrip();
        getTotal();
        billDetails();
        return getTotal() + billDetails();
    }

    private double getTotal(){

        double total = 0.00;

        return total;

    }

    private String billDetails() {

        String billDet = "";

        return billDet;

    }
}