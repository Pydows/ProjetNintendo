package test;

import java.util.ArrayList;
import java.util.List;

import metier.*;

public class Test {

	public static void main(String[] args) {
		
		Console PC = new Console("PC");
		Console PS2 = new Console("PS2");
		Console Switch = new Console("Switch");
		
		
		List<Console> consoles1 = new ArrayList<Console>();
		List<Console> consoles2 = new ArrayList<Console>();
		List<Console> consoles3 = new ArrayList<Console>();
		
		consoles1.add(Switch);
		consoles1.add(PS2);
		
		consoles2.add(PC);
		
		consoles3.add(Switch);
		consoles3.add(PC);		
		
		Boutique gameStore;
		
		Jeu MarioKart = new Jeu("MarioKart", consoles1,gameStore);
		Jeu JakDaxter = new Jeu("JakDaxter",consoles1,gameStore);
		Jeu AmongUs = new Jeu("AmongUs",consoles2,gameStore);
		Jeu Sims = new Jeu("Sims",consoles2,gameStore);
		Jeu AnimalCrossing = new Jeu("AnimalCrossing",consoles3,gameStore);

		List<Jeu> jeuxJohn = new ArrayList<Jeu>();
		
		
		
		
		
		

	}

}
