package Flow;

import java.util.ArrayList;
import java.util.List;

public interface TripState {


    void prev(Trip t);
    void next(Trip t);
    void action(Trip t);
}