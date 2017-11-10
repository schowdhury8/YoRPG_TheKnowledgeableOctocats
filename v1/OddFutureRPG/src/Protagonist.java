/**
 * Team Knowledgeable Octocats - Oliver Frank, Shayan Chowdhury, Kevin Feng
 * APCS pd02
 * HW28 -- Ye Olde Role Playing Game
 * 2017-11-09
 **/

/**
 * A Protagonist that can fight Monsters. Has attributes like:
 * <ul>
 * 	<li>name</li>
 *  <li>hp</li>
 * 	<li>strength</li>
 * 	<li>defense</li>
 * 	<li>attack rating</li>
 * </ul>
 * It can only attack currently. It has two attacks, normal and special.
 * The user is able to control this character. This class inherits properties from
 * the Entity class.
 * @author Oliver Frank
 */
public class Protagonist extends Entity{
	
	private int normalDEF;
	private double normalATK;
	
	/**
	 * The default constructor, it sets the HP, STR, DED, and ATK to
	 * reasonable values. Name is kobold by default
	 **/
	public Protagonist() {
 		this.name = "pat";
 		this.hp = 125;
 		this.str = 100;
 		this.def = 40;
 		this.normalDEF = this.def;
 		this.atk = 0.4;
 		this.normalATK = this.atk;
 	}
	
	/**
	 * Constructor that allows name of Entity to be set. Inherits other values
	 * from default constructor
	 **/
	public Protagonist(String name) {
 		this();
 		this.name = name;
 	}
	
 	/**
 	 * Attacks a given Monster with a calculated damage value based on strength, attack,
 	 * and the defense of the Monster
 	 * @param monster
 	 * @return damage dealt to protagonist
 	 */
 	public int attack(Monster monster) {
 		int dmg = (int) (str * atk) - monster.getDefense();
 		if (dmg < 0)
 			dmg = 0;
 		monster.lowerHP(dmg);
 		return dmg;
 	}
 	
 	/**
 	 * halfs the defense by 2 times and increases the attack by 2 times.
 	 */
 	public void specialize() {
 		def /= 2;
 		atk *= 2;
 	}
 	
 	/**
 	 * Makes the defense and attack the default values again
 	 */
 	public void normalize() {
 		def = normalDEF;
 		atk = normalATK;
 	}
} //end class
