/**
 * The Knowledgeable Octocats - Oliver Frank, Shayan Chowdhury, Kevin Feng
 * APCS pd02
 * HW28 -- Ye Olde Role Playing Game, Expanded
 * 2017-11-13
 **/

public class Engineer extends Monster {
    //Default constructor
    public Engineer () {
        _name = "Engineer";
        _hitPts = 150;
        _strength = 50;
        _defense = 150;
        _attack = 0.25;
    }

    //Overloaded constructor
    public Engineer (String name) {
        this();
        _name = name;
    }

    //static about() method
    public String about() {
        return "Howdy there, pardner, I'm the Engineer. Got a problem? Well, don't you worry cuz I'll solve it all nice and dandy, just like a true Texan.";
    }
}