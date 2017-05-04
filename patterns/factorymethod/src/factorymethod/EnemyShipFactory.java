package factorymethod;

public class EnemyShipFactory {
	

	public EnemyShip makeEnemyShip(String newShipType) {
		// TODO Auto-generated method stub
		if(newShipType.equals("U")){
			return new UFOEnemyShip();
		}
		
		else if(newShipType.equals("R")){
			return new RocketEnemyShip();
		}
		else 
		
		return null;
	}

}
