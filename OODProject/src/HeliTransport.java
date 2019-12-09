import java.util.ArrayList;

public class HeliTransport implements TransportType {

   String name;
   
   public HeliTransport(String nm) {
   
      this.name = nm;
   }
   
   @Override
   public String getTransportName() {

      return name;
   }
}