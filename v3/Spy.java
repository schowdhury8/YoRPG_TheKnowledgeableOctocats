/**
 * The Knowledgeable Octocats - Oliver Frank, Shayan Chowdhury, Kevin Feng
 * APCS pd02
 * HW28 -- Ye Olde Role Playing Game, Expanded
 * 2017-11-13
 **/

public class Spy extends Monster {
    //Default constructor
    public Spy () {
        _name = "Spy";
        _hitPts = 125;
        _strength = 100;
        _defense = 25;
        _attack = 1;
    }

    //Overloaded constructor
    public Spy (String name) {
        this();
        _name = name;
    }

    //static about() method
    public static String about() {
        return "Bonjour. I am the Spy. And that is all you need to know. Now, excuse me while I carry us to victory. But first, off to visit your mother!";
    }
}