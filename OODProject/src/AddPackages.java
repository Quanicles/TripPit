package Flow;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddPackages implements TripState {
    Scanner scan = new Scanner(System.in);

    @Override
    public void prev(Trip t) {
        // TODO Auto-generated method stub
        t.setState(new AddTravelers());

    }

    @Override
    public void next(Trip t) {
        // TODO Auto-generated method stub
        t.setState(new WhosPaying());
        t.nextState();

    }

    @Override
    public void action(Trip t) {
        // TODO Auto-generated method stub
        PackageSingleton packageSingleton = null;
        for(int i = 0; i < packageSingleton.getPackage().size(); i ++)
        {
            System.out.println(i+1 + ") " + packageSingleton.getPackage().get(i));
        }
       System.out.println("13) Done");
        System.out.println("14) Later");

        int choice = scan.nextInt();
        while(choice != 14 && choice != 13) {
            t.packages.add((String) packageSingleton.getPackage().get(choice));
            //Ask user if they would like to enter another package
            System.out.println("Use the above number guideline to continue");
            choice = scan.nextInt();

            if(choice == 14) {
                break;
            }
        }
        t.pt = t.packages.size() * 300;
        next(t);

    }

}