package settingup;
import java.util.Scanner;

public class SetUpGame {
	private int numPlayers; /**Integer attribute to track the number of players
	in the game so that an appropriate number of player objects can be created.**/
	
	private int numDays;    /**Integer attribute to track the number of days/rounds
	Only updated once at the creation of the game.**/
	
	/**Constructor for the class**/
	public SetUpGame() {
		
	}
	
	/**'Getter'
	 *  Returns the number of players in the game as an Integer**/
	public int getNumPlayers() {
		return numPlayers;
	}
	
	/**'Getter'
	 *  Returns the number of days in the game as an Integer**/
	public int getNumDays() {
		return numDays;
	}

	/**Prompts the player to set the number of players and days in the game,
	 * Does this by scanning integer inputs from the terminal
	 */
	public void getData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of Players: ");
		numPlayers = sc.nextInt();
		
		System.out.println("Number of Days: ");
		numDays = sc.nextInt();
		
		sc.close();
	}
	
	/**Main function to test the functionality of methods**/
	public static void main(String[] args) {
		SetUpGame setup = new SetUpGame();
		setup.getData();
		System.out.println(setup.numPlayers + " " + setup.numDays);
	}
}
