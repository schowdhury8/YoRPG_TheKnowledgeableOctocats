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

public class Monster extends Character
{

  // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  /*=============================================
    default constructor
    pre:  instance vars are declared
    post: initializes instance vars.
    =============================================*/
  public Monster()
  {
    _hitPts = 150;
    _strength = 20 + (int)( Math.random() * 45 ); // [20,65)
    _defense = 20;
    _attack = 1;
  }


  /*=============================================
    int attack(Protagonist) -- simulates attack on a Protagonist
    pre:  Input not null
    post: Calculates damage to be inflicted, flooring at 0. 
    Calls opponent's lowerHP() method to inflict damage. 
    Returns damage dealt.
    =============================================*/
  public int attack( Protagonist opponent )
  {
    int damage = (int)( (_strength * _attack) - opponent.getDefense() );
    //System.out.println( "\t\t**DIAG** damage: " + damage );

    if ( damage < 0 )
	    damage = 0;

    opponent.lowerHP( damage );

    return damage;
  }//end attack

  /**
  * Constructor that allows name to be set. Inherits other values
  * from default constructor
  **/
  public Monster(String name) {
    this();
    this.name = name;
  }//end overloaded constructor

}//end class Monster
