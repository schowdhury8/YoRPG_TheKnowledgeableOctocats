/**
 * The Knowledgeable Octocats - Oliver Frank, Shayan Chowdhury, Kevin Feng
 * APCS pd02
 * HW28 -- Ye Olde Role Playing Game, Expanded
 * 2017-11-13
 **/

public class Heavy extends Protagonist {
    //Default constructor
    public Heavy () {
        _name = "Heavy";
        _hitPts = 300;
        _strength = 100;
        _defense = 50;
        _attack = 0.75;
    }

    //Overloaded constructor
    public Heavy (String name) {
        this();
        _name = name;
    }

    public void specialize() {
	_defense /= 2;
	_attack *= 1.5;
    }

    public void normalize() {
	_defense = 50;
	_attack = .75;
    }
    
    //static about() method
    public String about() {
        return "I am Heavy Weapons Guy and I will crush any baby man that comes to fight me. Sandvich will help.";
    }
}
