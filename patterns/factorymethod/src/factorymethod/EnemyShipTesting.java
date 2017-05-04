package factorymethod;

import java.util.Scanner;

public class EnemyShipTesting {

	public static void main(String[] args)
	{
		EnemyShipFactory enemyshipfactory = new EnemyShipFactory();
		EnemyShip enemyShip = null;
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("What type of ship (U/R)");
		String type = userInput.nextLine();
		enemyShip = enemyshipfactory.makeEnemyShip(type);
		System.out.println(enemyShip.getName());
		
		
	}
}
