package com.springcore4.constructorInjection;

public class Person {
	private String name;
	private int id;
	private Certi certi;
	public Person(String name, int id ,Certi certi) {
		super();
		this.name = name;
		this.id = id;
		this.certi = certi;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return this.name+":"+this.id+"{"+this.certi.name+"}";
	}
	
	
}
