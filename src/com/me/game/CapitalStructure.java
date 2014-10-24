package com.me.game;

public class CapitalStructure extends Structure {
	private String name;
	private int moneyCost;
	private int materialCost;
	private int structureHealth;
	private int structureLevel;
	
	public CapitalStructure(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getMaterialCost() {
		return materialCost;
	}

	public int getMoneyCost() {
		return moneyCost;
	}
	
	public Structure getStructure() {
		return this;
	}

	public int getStructureHealth() {
		return structureHealth;
	}

	public int structureLevel() {
		return structureLevel;
	}
	
	public void applyModifiers() {
		
	}
}
