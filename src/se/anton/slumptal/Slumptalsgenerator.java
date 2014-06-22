package se.anton.slumptal;

import java.util.Random;

public class Slumptalsgenerator {

	public int generera(int min, int max) {
	    Random rand = new Random();

	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}
	
}
