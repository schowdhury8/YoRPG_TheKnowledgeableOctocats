/*
 * The Knowledgeable Octocats - Oliver Frank, Shayan Chowdhury, Kevin Feng
 * APCS pd02
 * HW28 -- Ye Olde Role Playing Game, Expanded
 * 2017-11-13
 **/

/**
 * Superclass of all Characters in the game. All Character should have the following
 * properties:
 * <ul>
 * <li>name</li>
 * <li>hp</li>
 * <li>str</li>
 * <li>def</li>
 * <li>atk</li>
 * </ul>
 * The current subclasses are Protagonist and Monster.
 * 
 * @author oliver
 *
 */

public class Character
{

    //this feels like a bad idea... but the compiler made me do it!
    protected int _hitPts, _strength, _defense;
    protected double _attack;


    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
    public int getDefense() { return _defense; }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    /**=============================================
     * tell whether I am alive
     * <br>
     * post: returns boolean indicated alive or dead
     **/
    public boolean isAlive()
    {
	return _hitPts > 0;
    }


    /**
     * lowers life by input value
     * <br>
     * pre:  Input >= 0
     * <br>
     * post: Life instance var is lowered by input ammount.
     **/
    public void lowerHP( int damageInflicted )
    {
	_hitPts = _hitPts - damageInflicted;
    }


    /**
     * simulates attack on a Protagonist.
     * <br>
     * pre:  Input not null
     * <br>
     * post: Calculates damage to be inflicted, flooring at 0.
     * <br>
     * Calls opponent's lowerHP() method to inflict damage.
     * Returns damage dealt.
     **/
    public int attack( Character opponent )
    {
	int damage = (int)( (_strength * _attack) - opponent.getDefense() );
	//System.out.println( "\t\t**DIAG** damage: " + damage );

	if ( damage < 0 )
	    damage = 0;

	opponent.lowerHP( damage );

	return damage;
    }//end attack


}//end class Character
