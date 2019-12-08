package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Agent a = new Agent();
        List<Trip> tList = a.getTrips();
        for (int i = 0; i < tList.size(); i++)
        {
            Trip t = tList.get(i);
            if(t.getState() == "addTravelers")
            {
                System.out.println(t.getID() + ":       Status: " + t.getState());
            }
        }
        for (int i = 0; i < tList.size(); i++)
        {
            Trip t = tList.get(i);
            if(t.getState() == "addPackages")
            {
                System.out.println(t.getID() + ":       Status: " + t.getState());
            }
        }
        for (int i = 0; i < tList.size(); i++)
        {
            Trip t = tList.get(i);
            if(t.getState() == "createTrip")
            {
                System.out.println(t.getID() + ":       Status: " + t.getState());
            }
        }

        boolean found = false;
        while(!found)
        {
            System.out.println();
            System.out.print("Enter Trip ID:  ");
            Scanner s = new Scanner(System.in);
            String idInput = s.nextLine();
            if(a.findTripIndex(idInput) == -1)
            {
                System.out.println();
                System.out.println("Trip not found. Try again.");
            }
            else
            {

                Trip tFound = tList.get(a.findTripIndex(idInput));
                System.out.println("Openning trip " + tFound.getID() + " in order to " + tFound.getState());
                found = true;
            }
        }
	// write your code here
    }
}

class Agent
{
    private List<Trip> tripList;

    public List getTrips()
    {
        if(tripList == null)
        {
            ArrayList<Trip> placeHolder = new ArrayList<Trip>();
            placeHolder.add(new Trip("addTravelers", "10001"));
            placeHolder.add(new Trip("addPackages", "10002"));
            placeHolder.add(new Trip("createTrip", "10003"));
            placeHolder.add(new Trip("addPackages", "10004"));
            placeHolder.add(new Trip("addTravelers", "10005"));
            placeHolder.add(new Trip("createTrip", "10006"));
            placeHolder.add(new Trip("addTravelers", "10007"));
            placeHolder.add(new Trip("addPackages", "10008"));
            placeHolder.add(new Trip("createTrip", "10009"));
            placeHolder.add(new Trip("addPackages", "10010"));

            tripList = placeHolder;
        }

        return tripList;
    }

    public int findTripIndex(String searchID)
    {
        for(int i = 0; i < tripList.size(); i++)
        {
            if(searchID.equals(tripList.get(i).getID()))
            {
                return i;
            }
        }

        return -1;

    }
}

class Trip
{

    private String state;
    private String idNum;

    public Trip(String st, String num)
    {
        state = st;
        idNum = num;
    }

    public String getState()
    {
        return state;
    }

    public String getID()
    {
        return idNum;
    }

}
