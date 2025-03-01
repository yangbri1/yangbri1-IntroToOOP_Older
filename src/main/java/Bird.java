
/**
 * 
 * Problem:
 * As of right now, Java comes with 8 primitive datatypes. 
 * What if we wanted to create our own datatypes?
 * 
 * Solution:
 * Classes allow us to define a custom datatype.
 * When we create a variable with a class as its datatype, that variable is considered an object.
 * NOTE: We have already seen objects with the String class.  
 *          Try "ctrl + left-click" on the text "String" to see the source code of the String class.
 * 
 * An object is an instantiation of a class.
 * We would like objects to be able to:
 *      a) contain some data
 *      and
 *      b) change its behavior based off of the data that it individually contains.
 *
 * Let's say we're working on a birdwatching app.
 * Using OOP, we could maintain many bird objects which individually contain their own
 * age, and can generate their own sound. This concept of an object controlling its own data can be
 * referred to as encapsulation.
 *
 * In the app, an individual bird should be able to "Tweet" if ageMonths is less than 3 and "Chirp" if ageMonths is
 * greater than or equal to 3.
 * 
 * 
 */

 // 'Bird' class -- custom 'Bird' data type in the making
public class Bird {
    /**
     * A variable (in this context, often referred to as a field), which represents the age of the bird.
     */
    public int ageMonths;   // required to set access modifier to 'public' if want subsequent children classes to 'extends' fields & methods from parent 'Bird' super class

    /**
     * A constructor for the bird class: this method allows us to build a new bird with the 'new' keyword.
     * No need to change anything here, for now.
     */
    public Bird(){
        // assign above 'ageMonths' field (point by 'this' keyword) w/ value from arg's 'ageMonth'
        // this.ageMonths = ageMonths;

        // initialize 'ageMonths' field w/ default value of 0 in this default Constructor (no args)
        ageMonths = 0;  // or omit since test cases does NOT seem to take default values into consideration
    }
    /**
     * @return "Tweet" if ageMonths is less than 3 and "Chirp" if ageMonths is
     *         greater than or equal to 3.
     */
    public String sound(){
        // if 'Bird' is less than 3 months old
        if(ageMonths < 3){
            // return "Tweet" String sound
            return("Tweet");
        }
        // otherwise return "Tweet" String sound
        return "Chirp";
    }

}
