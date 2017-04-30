package main;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int stayChoiceTally = 0;
		int switchChoiceTally = 0;
		
		for (int runs = 0; runs < 100; runs ++) {
			ArrayList<Door> doors = setUp();
			for (int i = 0; i < doors.size(); i ++) {
				if (doors.get(i).getIsCar() == false && doors.get(i).getIsChoice() == false) {
					doors.remove(i);
					break;
				}
			}
			if ((doors.get(0).getIsCar() == true && doors.get(0).getIsChoice()) || (doors.get(1).getIsCar() == true && doors.get(1).getIsChoice())) {
				stayChoiceTally ++;
			}
			else {
				switchChoiceTally ++;
			}
		}
		
		System.out.println("Stay wins: " + stayChoiceTally + " / 100");
		System.out.println("Switch wins: " + switchChoiceTally + " / 100");	
		
		System.exit(0);
	}
	
	private static ArrayList<Door> setUp() {
		Random rand = new Random();
		
		Door door1 = new Door();
		Door door2 = new Door();
		Door door3 = new Door();
		
		double choice = rand.nextDouble();
		if (choice >= 0 && choice < 1.0/3.0) {
			door1.setIsChoice(true);
		}
		else if (choice >= 1.0/3.0 && choice < 2.0/3.0) {
			door2.setIsChoice(true);
		}
		else {
			door3.setIsChoice(true);
		}
		
		double car = rand.nextDouble();
		if (car >= 0 && car < 1.0/3.0) {
			door1.setIsCar(true);
		}
		else if (car >= 1.0/3.0 && car < 2.0/3.0) {
			door2.setIsCar(true);
		}
		else {
			door3.setIsCar(true);
		}
		
		ArrayList<Door> doors = new ArrayList<Door>();
		doors.add(door1);
		doors.add(door2);
		doors.add(door3);
		
		return doors;
	}

}
