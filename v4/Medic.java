/*
 * The Knowledgeable Octocats - Oliver Frank, Shayan Chowdhury, Kevin Feng
 * APCS pd02
 * HW28 -- Ye Olde Role Playing Game, Expanded
 * 2017-11-13
 **/

/**
 * Pickable subclass of Protagonist. Has average hp, low attack, high defense.
 * 
 **/
public class Medic extends Protagonist {
    /**
     * Default Constructor for class.  Sets name to Medic by default.
     **/
    public Medic () {
        _name = "Medic";
        _hitPts = 150;
        _strength = 50;
        _defense = 150;
        _attack = 0.5;
    }

    /**
     * 1-parameter overloaded constructor.  Allows name to be set to user's choice.
     **/
    public Medic (String name) {
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
	_defense = 150;
	_attack = .5;
    }

    /**
     * Returns the about string for this protagonist class.  Now with 33% more Nietzche!
     **/
    public String about() {
        return "I am ze Ubermensch, ze wunderbar Medic, here to ki- I mean... heal you. Your organs may be of more use to me than you at some point but for now, let's go practice medicine.";
    }
}
