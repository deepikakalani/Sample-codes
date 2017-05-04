package factorymethod;

public abstract class EnemyShip {
	
	private String name;
	
	public String getName(){
		return name;
	}
	
	public void setName(String newName){
		name = newName;
	}

	public void followHeroShip(){
		System.out.println("Hero is followed by "+  getName());
	}
	
	public void displayEnemyShip(){
		System.out.println(getName() + " ship is on board");
	}
	
}
