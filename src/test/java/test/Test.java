package test;

import java.util.ArrayList;
import java.util.List;

import metier.*;

public class Test {
	
	Console PC = new Console("PC");
	Console PS2 = new Console("PS2");
	Console Switch = new Console("Switch");
	
	List<Console> consoles1 = new ArrayList<Console>();
	List<Console> consoles2 = new ArrayList<Console>();
	List<Console> consoles3 = new ArrayList<Console>();

	
	
	Jeu MarioKart = new Jeu("MarioKart", consoles1);
	Jeu JakDaxter = new Jeu("JakDaxter",consoles1);
	Jeu AmongUs = new Jeu("AmongUs",consoles2);
	Jeu Sims = new Jeu("Sims",consoles2);
	Jeu AnimalCrossing = new Jeu("AnimalCrossing",consoles3);

	
	
	
	
	
	public static void main(String[] args) {
		

	}

}
