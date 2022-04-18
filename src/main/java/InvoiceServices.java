import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class InvoiceServices {
    Map<String, ArrayList<Rides>> rideMap;

    public void InvoiceService() {
        this.rideMap= new HashMap<>();
    }

    public void addRide(String id, ArrayList<Rides> rides) {
        if(id != null)
            rideMap.put(id, rides);
    }
    public ArrayList<Rides> getRides(String id){
        if(rideMap.containsKey(id))
            return rideMap.get(id);
        return null;
    }
}
