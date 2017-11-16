/*
 * The Knowledgeable Octocats - Oliver Frank, Shayan Chowdhury, Kevin Feng
 * APCS pd02
 * HW28 -- Ye Olde Role Playing Game, Expanded
 * 2017-11-13
 **/

/**
 * Subclass of Monster. Has high attack but low defense
 * 
 **/
public class Spy extends Monster {
     /**
     * Default Constructor for class.  Sets name to Spy by default.
     **/
    public Spy () {
        _name = "Spy";
        _hitPts = 200;
        _strength = 80;
        _defense = 15;
        _attack = 1.5;
    }

      /**
     * 1-parameter overloaded constructor.  Allows name to be set to user's choice.
     **/
    public Spy (String name) {
        this();
        _name = name;
    }

    public String about() {
        return "I'm the spy!";
    }
}
