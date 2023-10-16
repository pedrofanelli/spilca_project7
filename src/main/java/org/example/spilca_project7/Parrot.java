package org.example.spilca_project7;


public class Parrot {
	private String name;
	
	public Parrot() {
		this.name = "Pepe";
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Nombre del loro: "+this.name;
	}
}
