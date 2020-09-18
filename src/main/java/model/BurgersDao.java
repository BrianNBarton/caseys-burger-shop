package model;
//this class will implement burgers interface
//therefor it must have all methods defined in burgers

import java.util.ArrayList;
import java.util.List;

public class BurgersDao implements Burgers {
//if we have a MYSQL connection instead of arraylist
    //create and find methods would do the exact same thing, and return
    //same data types everywhere except this exact file
    //has no idea what storage medium we are using.

    //create a temporary list to hold burgers as they are created
    private List<Burger> burgers = new ArrayList<>();

    //this method will search for a burger by its id
    //and return the full burger object
    @Override
    public Burger findByID(long id) {
//find the burger with the id thatas passed as an argument for this method
        //QUESTION: are arraylist 1 indexed or zero indexed?
        //answer, they are zero indexed

        return burgers.get((int) id - 1);
    }
//this method will create a burger object in our
    //local repository and return newly added burgers id


    @Override
    public long createBurger(Burger burger) {
//the id for each burger should be 1-indexed

        //to get id of new burger,
        // get the size of the current burgers list,
        //add one to it

        burger.setId(burgers.size() + 1);

//add the passed burger object (Burger) to arraylist
        burgers.add(burger);

//return newly added burger id as a long value
        return burger.getId();

    }
}
