/*
 * The Knowledgeable Octocats - Oliver Frank, Shayan Chowdhury, Kevin Feng
 * APCS pd02
 * HW28 -- Ye Olde Role Playing Game, Expanded
 * 2017-11-13
 **/

/**
 * Subclass of Monster. Has high strength, attack but low HP
 * 
 **/
public class Pyro extends Monster {
     /**
     * Default Constructor for class.  Sets name to Pyro by default.
     **/
    public Pyro () {
        _name = "Pyro";
        _hitPts = 150;
        _strength = 150;
        _defense = 30;
        _attack = 1;
    }

      /**
     * 1-parameter overloaded constructor.  Allows name to be set to user's choice.
     **/
    public Pyro (String name) {
        this();
        _name = name;
    }

    public String about() {
        return "I'm the pyro!";
    }
}
