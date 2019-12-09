import java.util.ArrayList;

public class TankTransport implements TransportType {

   String name;
   
   public TankTransport(String nm) {
   
      this.name = nm;
   }
   
   @Override
   public String getTransportName() {

      return name;
   }
}