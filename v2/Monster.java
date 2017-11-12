/**
 * The Knowledgeable Octocats - Oliver Frank, Shayan Chowdhury, Kevin Feng
 * APCS pd02
 * HW28 -- Ye Olde Role Playing Game
 * 2017-11-09
 **/


/**
 * A Monster to be fought by the Protagonist. Has attributes like:
 * <ul>
 * 	<li>name</li>
 *      <li>hp</li>
 * 	<li>strength</li>
 * 	<li>defense</li>
 * 	<li>attack rating</li>
 * </ul>
 * It can only attack currently. It only has one attack
 * @author Oliver Frank
 */
public class Monster extends Character {
    /**
     * The default constructor, it sets the HP, STR, DED, and ATK to
     * reasonable values. Name is kobold by default
     **/
    public Monster() {
        this.name = "kobold";
        this.hp = 150;
        this.str = (int) (Math.random() * 45) + 20;
        this.def = 20;
        this.atk = 1;
    }
	
    /**
     * Constructor that allows name to be set. Inherits other values
     * from default constructor
     **/
    public Monster(String name) {
        this();
        this.name = name;
    }
}
