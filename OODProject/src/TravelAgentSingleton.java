package Flow;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class TravelAgentSingleton
{
    private static final Object syncLock = new Object();
    private static volatile TravelAgentSingleton _travelAgentSingleton;
    private List<String> agentList;

    private TravelAgentSingleton()
    {
        ArrayList<String> placeHolder = new ArrayList<String>();
        placeHolder.add("Murdock");
        placeHolder.add("Baracus");
        placeHolder.add("Hannibal");
        placeHolder.add("Faceman");
        agentList = Collections.unmodifiableList(placeHolder);
    }

    public static List getAgents()
    {
        if(_travelAgentSingleton == null)
        {
            synchronized (syncLock)
            {
                if (_travelAgentSingleton == null)
                {
                    _travelAgentSingleton = new TravelAgentSingleton();
                }
            }
        }

        return _travelAgentSingleton.agentList;
    }
}