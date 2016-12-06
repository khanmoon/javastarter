package com.factory.pattern;

public class Factory {
	public Animal name(String m) {
		if(m.equals("Bird")){
			return new Bird();
		}
		else{
			return new Dog();
		}
	}
}
