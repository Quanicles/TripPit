package Flow1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


final class PersonSingleton
{
    private static final Object syncLock = new Object();
    private static volatile PersonSingleton _personSingleton;
    private List<String> personList;

    private PersonSingleton()
    {
        ArrayList<String> placeHolder = new ArrayList<String>();
        placeHolder.add("Jimmy");
        placeHolder.add("Timmy");
        placeHolder.add("Kimmy");
        placeHolder.add("Benny");
        placeHolder.add("Paul");
        personList = Collections.unmodifiableList(placeHolder);
    }

    public static List getPeople()
    {
        if(_personSingleton == null)
        {
            synchronized (syncLock)
            {
                if (_personSingleton == null)
                {
                    _personSingleton = new PersonSingleton();
                }
            }
        }

        return _personSingleton.personList;
    }
}

