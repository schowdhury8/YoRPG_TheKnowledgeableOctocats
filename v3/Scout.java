/*
 * The Knowledgeable Octocats - Oliver Frank, Shayan Chowdhury, Kevin Feng
 * APCS pd02
 * HW28 -- Ye Olde Role Playing Game, Expanded
 * 2017-11-13
 **/

/**
 * Pickable subclass of Protagonist. Has low hp, high attack, low defense.
 * 
 **/
public class Scout extends Protagonist {
     /**
     * Default Constructor for class.  Sets name to Scout by default.
     **/
    public Scout () {
        _name = "Scout";
        _hitPts = 125;
        _strength = 100;
        _defense = 25;
        _attack = 1;
    }

      /**
     * 1-parameter overloaded constructor.  Allows name to be set to user's choice.
     **/
    public Scout (String name) {
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
	_defense = 25;
	_attack = 1;
    }

    /**
     * Returns the about string for this protagonist class.  Now with 60% more Bawsten!
     **/
    public String about() {
        return "Hey you, yeah you. I'm talkin to ya. You know who I am? I'm the most beautiful thing you're ever gonna see in your life, pal. I'm the Scout... and don't you ever forget it.";
    }
}
