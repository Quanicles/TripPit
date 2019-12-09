import java.util.ArrayList;

public class PrivHeliTransport implements TransportType {

   String name;
   
   public PrivHeliTransport(String nm) {
   
      this.name = nm;
   }
   
   @Override
   public String getTransportName() {

      return name;
   }
}