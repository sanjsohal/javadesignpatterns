package com.templatemethod.pattern.ducksortexample;

public class Duck implements Comparable{
	String name;
	int weight;
	
	public Duck(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	public String toString() {
		return name + " weighs "+weight;
	}
	@Override
	public int compareTo(Object o) {
		Duck anotherObject = (Duck)o;
		if(this.weight<anotherObject.weight) {
			return -1;
		} else if(this.weight == anotherObject.weight) {
			return 0;
		}
		return 1;
	}
}
