/**
 * The Knowledgeable Octocats - Oliver Frank, Shayan Chowdhury, Kevin Feng
 * APCS pd02
 * HW28 -- Ye Olde Role Playing Game
 * 2017-11-09
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
public class Character {
	protected String name; //Name
	protected int hp, str, def; //Health, Strength, Defense
	protected double atk; //Attack rating
	
	/**
	 * Returns whether the Character is alive (has more than 0 hp)
	 * @return Is the Character alive
	 **/
	public boolean isAlive() {
 		return this.hp > 0;
 	}
 	
	/**
	 * Returns current defense of Character for damage calculations
	 * @return defense of Character
	 **/
 	public int getDefense() {
 		return this.def;
 	}
 	
 	/**
 	 * returns name of Character.
 	 **/
 	public String getName() {
 		return this.name;
 	}
 	
 	/**
 	 * Lowers the HP of the Character by damage amount
 	 **/
 	public void lowerHP(int damage) {
 		this.hp -= damage;
 	}
 	
 	/**
 	 * Attacks a given Character with a calculated damage value based on strength, attack,
 	 * and the defense of the Character being attacked
 	 * @param monster
 	 * @return damage dealt to Character
 	 */
 	public int attack(Character character) {
 		int dmg = (int) (str * atk) - character.getDefense();
 		if (dmg < 0)
 			dmg = 0;
 		character.lowerHP(dmg);
 		return dmg;
 	}
}
