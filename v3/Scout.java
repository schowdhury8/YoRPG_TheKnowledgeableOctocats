/**
 * The Knowledgeable Octocats - Oliver Frank, Shayan Chowdhury, Kevin Feng
 * APCS pd02
 * HW28 -- Ye Olde Role Playing Game, Expanded
 * 2017-11-13
 **/

public class Scout extends Protagonist {
    //Default constructor
    public Scout () {
        _name = "Scout";
        _hitPts = 125;
        _strength = 100;
        _defense = 25;
        _attack = 1;
    }

    //Overloaded constructor
    public Scout (String name) {
        this();
        _name = name;
    }

    //static about() method
    public String about() {
        return "Hey you, yeah you. I'm talkin to ya. You know who I am? I'm the most beautiful thing you're ever gonna see in your life, pal. I'm the Scout... and don't you ever forget it.";
    }
}