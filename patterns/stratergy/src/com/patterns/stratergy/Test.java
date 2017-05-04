package com.patterns.stratergy;

public class Test {

	public static void main(String[] args){
		
		Animal doggy = new Dog();
		System.out.println(doggy.tryToFly());
		doggy.setFlyingType(new ItFlys());
		
		System.out.println(doggy.tryToFly());
	}
}
