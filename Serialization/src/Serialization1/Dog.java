package Serialization1;

import java.io.Serializable;

public class Dog implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String color;
	private transient String breed;
	private int age;
	
	public Dog() {
		this("Mercy", "black", "Unknown", 1);
	}
	
	public Dog(String n, String c) {
		this(n, c, "Unknown", 2);
	}
	
	public Dog(String name, String color, String breed, int age) {
		this.name = name;
		this.color = color;
		this.breed = breed;
		this.age = age;
	}
	
	public void bark(int r) {
		this.age += r;
	}
	public void eat(int e) {
		this.age -= e;
	}
	public void sleep() {}
	public void play(int s) {
		this.age += s;
	}

	@Override
	public String toString() {
		return "name : " + name + "\ncolor : " + color + "\nbreed : " + breed + "\nage : " + age
				+ "\n==========================";
	}

	public Integer getAge() {
		// TODO Auto-generated method stub
		return this.age;
	}
	
	
}
