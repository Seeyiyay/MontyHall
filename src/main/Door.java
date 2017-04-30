package main;

public class Door {
	
	private boolean isChoice;
	private boolean isCar;
	
	public Door() {
		this.isChoice = false;
		this.isCar = false;
	}
	
	public void switchChoice() {
		if (this.isChoice == true) {
			this.isChoice = false;
		}
		else {
			this.isChoice = true;
		}
	}
	
	public boolean getIsChoice() {
		return this.isChoice;
	}
	
	public void setIsChoice(boolean isChoice) {
		this.isChoice = isChoice;
	}
	
	public boolean getIsCar() {
		return this.isCar;
	}
	
	public void setIsCar(boolean isCar) {
		this.isCar = isCar;
	}

}
