package com.app;

public class Player {
	String name,type;

	public Player() {}
	public Player(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", type=" + type + "]";
	}
	

}
