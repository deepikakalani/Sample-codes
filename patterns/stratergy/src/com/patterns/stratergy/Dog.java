package com.patterns.stratergy;

public class Dog extends Animal{

	public Dog(){
		super();
		flyingType = new CantFly();
	}
}
