/**
 * Team OFWGKTA - Oliver Frank, Shayan Chowdhury, Kevin Feng
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
 * The user is able to control this character
 * @author Oliver Frank
 */
public class Protagonist {

	private String name; //Name
	private int hp, str, def; //Health, Strength, Defense
	private int normalDEF;
	private double atk, normalATK;
	
	/**
	 * The default constructor, it sets the HP, STR, DED, and ATK to
	 * reasonable values. A name for the protagonist must be specified.
	 **/
 	public Protagonist(String name) {
 		this.name = name;
 		this.hp = 125;
 		this.str = 100;
 		this.def = 40;
 		this.atk = 0.4;
 		this.normalATK = this.atk;
 		this.normalDEF = this.def;
 	}
 	
 	/**
	 * Returns whether the protagonist is alive (has more than 0 hp)
	 * @return Is the protagonist alive
	 **/
 	public boolean isAlive() {
 		return hp > 0;
 	}
 	
 	/**
	 * Returns current defense of the protagonist for damage calculations
	 * @return defense of protagonist
	 **/
 	public int getDefense() {
 		return def;
 	}
 	
 	/**
 	 * returns name of protagonist.
 	 * @return name of protagonist
 	 **/
 	public String getName() {
 		return name;
 	}
 	
 	/**
 	 * Lowers the HP of the protagonist by damage amount
 	 **/
 	public void lowerHP(int damage) {
 		hp -= damage;
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
