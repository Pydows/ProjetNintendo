package metier;

public class Client {
	
	private String nom, prenom, jeu;

	public Client(String nom, String prenom, String jeu) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.jeu = jeu;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getJeu() {
		return jeu;
	}

	public void setJeu(String jeu) {
		this.jeu = jeu;
	}
	
	

}
