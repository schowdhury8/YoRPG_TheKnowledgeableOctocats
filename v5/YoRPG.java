/**
 * The Knowledgeable Octocats - Oliver Frank, Shayan Chowdhury, Kevin Feng
 * APCS pd02
 * HW28 -- Ye Olde Role Playing Game, Expanded
 * 2017-11-13
 **/

import java.io.*;
import java.util.*;

/**********************************************
 * class YoRPG -- Driver file for Ye Olde Role Playing Game.
 * Simulates monster encounters of a wandering adventurer.
 * Required classes: Protagonist, Monster
 * @author Mr. Brown
 **********************************************/
public class YoRPG
{
	// ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~

	//change this constant to set number of encounters in a game
	public final static int MAX_ENCOUNTERS = 5;

	//each round, a Protagonist and a Monster will be instantiated...
	private Protagonist pat;   //Is it man or woman?
	private Monster smaug; //Friendly generic monster name?

	private int moveCount;
	private boolean gameOver;
	private int difficulty;
	private int classP;

	private InputStreamReader isr;
	private BufferedReader in;
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


	// ~~~~~~~~~~ DEFAULT CONSTRUCTOR ~~~~~~~~~~~
	public YoRPG()
	{
		moveCount = 0;
		gameOver = false;
		isr = new InputStreamReader( System.in );
		in = new BufferedReader( isr );
		newGame();
	}
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


	// ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~~~

	/**
    * void newGame() -- gathers info to begin a new game
    * <br>
    * pre:
    * <br>  
    * post: according to user input, modifies instance var for difficulty 
    * and instantiates a Protagonist
    =============================================*/
	public void newGame()
	{
		String s;
		String name = "";
		s = "~~~ Welcome to Ye Olde RPG! ~~~\n";

		s += "\nChoose your difficulty: \n";
		s += "\t1: Easy\n";
		s += "\t2: Not so easy\n";
		s += "\t3: Beowulf hath nothing on me. Bring it on.\n";
		System.out.print( s );

		//This section was changed to handle people putting in weird values
		boolean hasDifficulty = false;
		boolean hasClass = false;
		String badValue = "\n Thou must entereth a numeral betwixt 1 and 3! \n \n";

		while (!hasDifficulty) {
			try {
				System.out.print("Selection: ");
				difficulty = Integer.parseInt( in.readLine() );
				if(difficulty >= 1 && difficulty <= 3) {
					hasDifficulty = true;
				} else {
					System.out.print(badValue);
				}
			}	
			catch (IOException e) {
				System.out.print(badValue);
			}
			catch (NumberFormatException e) {
				System.out.print(badValue);
			}
		}

		s = "Intrepid protagonist, what doth thy call thyself? (State your name): ";
		System.out.print( s );

		try {
			name = in.readLine();
		}
		catch ( IOException e ) { }

		
		while (!hasClass){
			try {
				System.out.print("Select your class: Heavy(1) Medic(2) Scout(3) ");
				classP = Integer.parseInt( in.readLine() );
				if (classP == 1){
					pat = new Heavy();
					hasClass = true;
				}
				if (classP == 2){
					pat = new Medic();
					hasClass = true;
				}
				if (classP == 3){
					pat = new Scout();
					hasClass = true;
				}
			}
			catch (IOException e) {
				System.out.print(badValue);
			}
			catch (NumberFormatException e) {
				System.out.print(badValue);
			}
		}
		//instantiate the player's character
		System.out.print(name + " has spawned as a " + pat._name + "!");

	}//end newGame()

	public String chooseClass(Protagonist className) {
		pat = className;
		return "You have spawned as a "+className._name+"!";
	}

	/**=============================================
    * boolean playTurn -- simulates a round of combat
    * <br>
    * pre:  Protagonist pat has been initialized
    * <br>
    * post: Returns true if player wins (monster dies).
    * Returns false if monster wins (player dies).
    =============================================**/
	public boolean playTurn()
	{
		int i = 1;
		int d1, d2;

		//spawn random type of monster
			int randomNum = (int)(Math.random() * 3);
			
			if (randomNum == 0){
				smaug = new Engineer();
			}
			if (randomNum == 1){
				smaug = new Spy();
			}
			if (randomNum == 2){
				smaug = new Pyro();
			}
			
		if ( Math.random() >= ( difficulty / 3.0 ) )
			System.out.println( "\nNothing to see here. Move along!" );
		else {
			System.out.println( "\nLo, yonder " + smaug._name +" approacheth!" );


			
			while( smaug.isAlive() && pat.isAlive() ) {

				// Give user the option of using a special attack:
				// If you land a hit, you incur greater damage,
				// ...but if you get hit, you take more damage.
				
				//This section has been changed to deal with people putting weird values in
				boolean hasAnswer = false;
			    
			    String badValue = "Thou must entereth a numeral betwixt 1 and 2! \n";
			    
			    while (!hasAnswer) {
			    	try {   System.out.println( "\nYou have " + pat.getHealth() + " points of health.");
			    		System.out.println( "\nDo you feel lucky?" );
			    		System.out.println( "\t1: Nay.\n\t2: Aye!" );
			    		i = Integer.parseInt( in.readLine() );
			    		if(i >= 1 && i <= 2) {
			    			hasAnswer = true;
			    		} else {
			        		System.out.print(badValue);
			    		}
			    	}	
			    	catch (IOException e) {
			    		System.out.print(badValue);
			    	}
			    	catch (NumberFormatException e) {
			    		System.out.print(badValue);
			    	}
			    }
				
				if ( i == 2 )
					pat.specialize();
				else
					pat.normalize();

				d1 = pat.attack( smaug );
				d2 = smaug.attack( pat );

				System.out.println( "\n" + pat.getName() + " dealt " + d1 +
						" points of damage.");

				System.out.println( "\n" + smaug._name + " smacked " + pat.getName() +
						" for " + d2 + " points of damage.");
			}//end while

			//option 1: you & the monster perish
			if ( !smaug.isAlive() && !pat.isAlive() ) {
				System.out.println( "'Twas an epic battle, to be sure... " + 
						"You cut ye olde monster down, but " +
						"with its dying breath ye olde monster. " +
						"laid a fatal blow upon thy skull." );
				return false;
			}
			//option 2: you slay the beast
			else if ( !smaug.isAlive() ) {
				System.out.println( "HuzzaaH! Ye olde monster hath been slain!" );
				return true;
			}
			//option 3: the beast slays you
			else if ( !pat.isAlive() ) {
				System.out.println( "Ye olde self hath expired. You got dead." );
				return false;
			}
		}//end else

		return true;
	}//end playTurn()
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


	public static void main( String[] args )
	{
		//As usual, move the begin-comment bar down as you progressively 
		//test each new bit of functionality...

		//loading...
		YoRPG game = new YoRPG();

		int encounters = 0;

		while( encounters < MAX_ENCOUNTERS ) {
			
			if ( !game.playTurn() )
				break;
			encounters++;
			System.out.println();
		}

		System.out.println( "Thy game doth be over." );
	}//end main

}//end class YoRPG
