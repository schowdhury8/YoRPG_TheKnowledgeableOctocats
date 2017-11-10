/**
 * The Knowledgeable Octocats - Oliver Frank, Shayan Chowdhury, Kevin Feng
 * APCS pd02
 * HW28 -- Ye Olde Role Playing Game
 * 2017-11-09
 **/

public abstract class Entity {
	protected String name; //Name
	protected int hp, str, def; //Health, Strength, Defense
	protected double atk; //Attack rating
	
	/**
	 * Returns whether the Entity is alive (has more than 0 hp)
	 * @return Is the Entity alive
	 **/
	public boolean isAlive() {
 		return this.hp > 0;
 	}
 	
	/**
	 * Returns current defense of monster for damage calculations
	 * @return defense of monster
	 **/
 	public int getDefense() {
 		return this.def;
 	}
 	
 	/**
 	 * returns name of monster.  This will just be "kobold" if none is set
 	 * @return name of character
 	 **/
 	public String getName() {
 		return this.name;
 	}
 	
 	/**
 	 * Lowers the HP of the monster by damage amount
 	 **/
 	public void lowerHP(int damage) {
 		this.hp -= damage;
 	}
}
