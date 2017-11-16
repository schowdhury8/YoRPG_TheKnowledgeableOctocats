/*
 * The Knowledgeable Octocats - Oliver Frank, Shayan Chowdhury, Kevin Feng
 * APCS pd02
 * HW28 -- Ye Olde Role Playing Game, Expanded
 * 2017-11-13
 **/

/**
 * Subclass of Monster. Has high defense but low strength
 * 
 **/
public class Engineer extends Monster {
     /**
     * Default Constructor for class.  Sets name to Engineer by default.
     **/
    public Engineer () {
        _name = "Engineer";
        _hitPts = 200;
        _strength = 50;
        _defense = 60;
        _attack = .8;
    }

      /**
     * 1-parameter overloaded constructor.  Allows name to be set to user's choice.
     **/
    public Engineer (String name) {
        this();
        _name = name;
    }

    public String about() {
        return "I'm the engineer!";
    }
}
