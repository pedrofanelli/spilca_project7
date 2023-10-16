package org.example.spilca_project7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

	//@Autowired
	private Parrot mascota; // 1er modo, directamente sobre el field!
	
	private String name = "Tatiana";
	
	@Autowired               // 2do modo, más recomendado!
	public Person(@Qualifier("loro2") Parrot loro){
		this.mascota = loro;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	//@Autowired        // 3er modo, no usar!
	public void setMascota(Parrot loro) {
		this.mascota = loro;
	}
	public String getName() {
		return this.name;
	}
	public Parrot getMascota() {
		return this.mascota;
	}
}
