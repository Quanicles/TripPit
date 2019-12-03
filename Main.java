package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

}

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
