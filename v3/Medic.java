/**
 * The Knowledgeable Octocats - Oliver Frank, Shayan Chowdhury, Kevin Feng
 * APCS pd02
 * HW28 -- Ye Olde Role Playing Game, Expanded
 * 2017-11-13
 **/

public class Medic extends Protagonist {
    //Default constructor
    public Medic () {
        _name = "Medic";
        _hitPts = 150;
        _strength = 50;
        _defense = 150;
        _attack = 0.5;
    }

    //Overloaded constructor
    public Medic (String name) {
        this();
        _name = name;
    }

    public void specialize() {
	_defense /= 2;
	_attack *= 1.5;
    }

    public void normalize() {
	_defense = 150;
	_attack = .5;
    }

    //static about() method
    public String about() {
        return "I am ze Ubermensch, ze wunderbar Medic, here to ki- I mean... heal you. Your organs may be of more use to me than you at some point but for now, let's go practice medicine.";
    }
}
