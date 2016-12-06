package com.factory.pattern;

public class Bird extends Animal {
	public Bird(){
		behaviour = new Flying();
	}
}
