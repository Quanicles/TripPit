package Flow;

import java.util.ArrayList;

public class ClientDecorator extends ItineraryDecorator {

    public ClientDecorator (Itinerary itineraryToBeDecorated, Trip tr){
        super(itineraryToBeDecorated, tr);
    }

    @Override
    public String getTrip() {
        super.getTrip();
        return getClients();
    }

    private String getClients() {

        ArrayList<java.lang.String> trArray = tr.travelers;

        System.out.println("Clients:" + "\n");
        String clients;
        int size = trArray.size();
        clients = size + " Clients \n";
        for(int i=0; i < size; i++){
            clients = clients + (i+1) + ".  " + trArray.get(i) + "\n";
        }

        return clients;
    }
}