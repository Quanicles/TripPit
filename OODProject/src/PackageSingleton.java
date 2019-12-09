package Flow;
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
        placeHolder.add("Atlanta, Georgia to Beijing, China");
        placeHolder.add("Atlanta, Georgia to Sydney, Australia");
        placeHolder.add("Atlanta, Georgia  to Paris, France");
        placeHolder.add("Beijing, China to Atlanta, Georgia ");
        placeHolder.add("Beijing, China to Paris, France");
        placeHolder.add("Beijing, China to Sydney, Australia");
        placeHolder.add("Paris, France to Atlanta, Georgia");
        placeHolder.add("Paris, France to Beijing, China");
        placeHolder.add("Paris, France to Sydney, Australia");
        placeHolder.add("Sydney, Australia to Atlanta, Georgia");
        placeHolder.add("Sydney, Australia to Beijing, China");
        placeHolder.add("Sydney, Australia to Paris, France");
        packageList = Collections.unmodifiableList(placeHolder);
    }

    public static List getPackage()
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