package Flow1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class PackageSingleton
{
    private static final Object syncLock = new Object();
    private static volatile PackageSingleton _packageSingleton;
    private List<String> packageList;

    private PackageSingleton()
    {
        ArrayList<String> placeHolder = new ArrayList<String>();
        placeHolder.add("ATL to China");
        placeHolder.add("China to ATL");
        placeHolder.add("China to Paris");
        placeHolder.add("ATL to Australia");
        packageList = Collections.unmodifiableList(placeHolder);
    }

    public static List getAgents()
    {
        if(_packageSingleton == null)
        {
            synchronized (syncLock)
            {
                if (_packageSingleton == null)
                {
                    _packageSingleton = new PackageSingleton();
                }
            }
        }

        return _packageSingleton.packageList;
    }
}