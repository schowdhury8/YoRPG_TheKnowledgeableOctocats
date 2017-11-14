/**
 * The Knowledgeable Octocats - Oliver Frank, Shayan Chowdhury, Kevin Feng
 * APCS pd02
 * HW28 -- Ye Olde Role Playing Game, Expanded
 * 2017-11-13
 **/

public class Pyro extends Monster {
    //Default constructor
    public Pyro () {
        _name = "Pyro";
        _hitPts = 250;
        _strength = 100;
        _defense = 150;
        _attack = 0.75;
    }

    //Overloaded constructor
    public Pyro (String name) {
        this();
        _name = name;
    }

    //static about() method
    public String about() {
        return "Murr hurr mphuphurrur, hurr mph phrr. Murr murr hur... hudda hudda huh!";
    }
}