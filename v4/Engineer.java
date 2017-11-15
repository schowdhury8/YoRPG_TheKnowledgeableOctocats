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
public class Engineer extends Monster {
     /**
     * Default Constructor for class.  Sets name to Scout by default.
     **/
    public Engineer () {
        _name = "Engineer";
        _hitPts = 200;
        _strength = 80;
        _defense = 30;
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
        return "Hey you, yeah you. I'm talkin to ya. You know who I am? I'm the most beautiful thing you're ever gonna see in your life, pal. I'm the Scout... and don't you ever forget it.";
    }
}
