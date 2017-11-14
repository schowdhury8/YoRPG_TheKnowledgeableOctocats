/**
 * The Knowledgeable Octocats - Oliver Frank, Shayan Chowdhury, Kevin Feng
 * APCS pd02
 * HW28 -- Ye Olde Role Playing Game, Expanded
 * 2017-11-13
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




}//end class Monster
