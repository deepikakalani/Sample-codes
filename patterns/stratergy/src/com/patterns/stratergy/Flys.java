package com.patterns.stratergy;

public interface Flys {
	
	String fly();

}


class ItFlys implements Flys{

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "It flys high";
	}
	
}

class CantFly implements Flys{

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "Cant fly";
	}
	
}
