package test;

import java.util.ArrayList;
import java.util.List;

import metier.*;

public class Test {

	public static void main(String[] args) {
		
		
		
		Console PC = new Console("PC", 1500,"2020");
		Console PS2 = new Console("PS2", 150.50, "2002");
		Console Switch = new Console("Switch", 300, "2017");
		
		
		List<Console> consoles1 = new ArrayList<Console>();
		List<Console> consoles2 = new ArrayList<Console>();
		List<Console> consoles3 = new ArrayList<Console>();
		
		consoles1.add(Switch);
		consoles1.add(PS2);
		
		consoles2.add(PC);
		
		consoles3.add(Switch);
		consoles3.add(PC);		
		Adresse adresse1 = new Adresse (62, "rue du cheval", "UHdada");
		List<Jeu> jeux = new ArrayList();
		
		Boutique gameStore= new Boutique("Micromania", adresse1, jeux);
		
		Jeu MarioKart = new Jeu("MarioKart", consoles1,gameStore);
		Jeu JakDaxter = new Jeu("JakDaxter",consoles1,gameStore);
		Jeu AmongUs = new Jeu("AmongUs",consoles2,gameStore);
		Jeu Sims = new Jeu("Sims",consoles2,gameStore);
		Jeu AnimalCrossing = new Jeu("AnimalCrossing",consoles3,gameStore);
		
		jeux.add(JakDaxter);
		jeux.add(MarioKart);
		jeux.add(AmongUs);
		jeux.add(Sims);
		jeux.add(AnimalCrossing);
		
		List<Jeu> jeuxJohn = new ArrayList<Jeu>();
		Client John = new Client ("Nom", "John", null);
		
		
		
		
		

	}

}
