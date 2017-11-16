/*
 * The Knowledgeable Octocats - Oliver Frank, Shayan Chowdhury, Kevin Feng
 * APCS pd02
 * HW28 -- Ye Olde Role Playing Game, Expanded
 * 2017-11-13
 **/

/**
 * Pickable subclass of Protagonist. Has high hp, average attack, low defense.
 * 
 **/
public class Heavy extends Protagonist {
    /**
     * Default Constructor for class.  Sets name to heavy by default.
     **/
    public Heavy () {
        _name = "Heavy";
        _hitPts = 300;
        _strength = 100;
        _defense = 50;
        _attack = 0.75;
    }

    /**
     * 1-parameter overloaded constructor.  Allows name to be set to user's choice.
     **/
    public Heavy (String name) {
        this();
        _name = name;
    }

    /**
     * Prepares protagonist for a special attack. Halves defense and 1.5x to attack modifier.
     **/
    public void specialize() {
	_defense /= 2;
	_attack *= 1.5;
    }

    /**
     * Prepares protagonist for a normal attack. sets defense and attack modifier to default values.
     **/
    public void normalize() {
	_defense = 50;
	_attack = .75;
    }
    
    /**
     * Returns the about string for this protagonist class.  Now with 25% more comrade!
     **/
    public String about() {
        return "I am Heavy Weapons Guy and I will crush any baby man that comes to fight me. Sandvich will help.";
    }
}
