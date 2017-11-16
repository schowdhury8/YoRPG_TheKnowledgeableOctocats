/**
 * The Knowledgeable Octocats - Oliver Frank, Shayan Chowdhury, Kevin Feng
 * APCS pd02
 * HW28 -- Ye Olde Role Playing Game, Expanded
 * 2017-11-13
 **/

/**
 * A Protagonist that can fight Monsters. Has attributes like:
 * <ul>
 * 	<li>_name</li>
 *  <li>_hitPts</li>
 * 	<li>_strength</li>
 * 	<li>_defense</li>
 * 	<li>_attack</li>
 * </ul>
 * It can only attack currently. It has two attacks, normal and special.
 * The user is able to control this character. This class inherits properties from
 * the Entity class.
 * @author Oliver Frank
 */
abstract public class Protagonist extends Character
{
    protected String _name;
    protected int _money;

    /**
     * default constructor
     * <br>
     * pre:  instance vars are declared
     * <br>
     * post: initializes instance vars.
     **/
    public Protagonist()
    {
	_hitPts = 125;
	_strength = 100;
	_defense = 40;
    _attack = .4;
    _money = 0;
    }

    
    /**
     * overloaded constructor
     * pre:  instance vars are declared
     * post: initializes instance vars. _name is set to input String.
     **/
    public Protagonist( String name ) {
	this();
	_name = name;
    }
    
    
    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
    public String getName() { return _name; }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
    
    

    //prepare a Protagonist for a special attack
    public abstract void specialize();
    
    
    //revert to normal mode
    public abstract void normalize();

    //return the about string for the protagonist type
    public abstract String about();
   
   //return the health
    public int getHealth() {
    	return _hitPts;
    }
    

   //MUTATORS
   public int getMoney(int loot) {
       _money += loot;
       return _money;
   }
   //change the hp value and return it
   public int hpBuff(int buff) {
       _hitPts += buff;
       return _hitPts;
   }

   //change the strength value and returns it
   public int strBuff(int buff) {
       _strength += buff;
       return _strength;
   }

   //change the defense value and returns it
   public int defBuff(int buff) {
       _defense += buff;
       return _defense;
   }
   
}//end class Protagonist
