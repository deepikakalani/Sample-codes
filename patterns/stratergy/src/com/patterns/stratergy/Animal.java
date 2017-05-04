package com.patterns.stratergy;

public class Animal {

		private String name;
		public Flys flyingType;
		
		public void setName(String strName){
			name = strName;
		}
		
		public String getName(){
			return name;
		}
		
		public String tryToFly(){
			return flyingType.fly();
		}
		
		public void setFlyingType(Flys newFlyType){
			flyingType = newFlyType;
		}
}
