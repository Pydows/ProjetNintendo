package metier;

import java.util.List;

public class Client {
	
	private String nom, prenom;
	private List<Jeu> listeJeux;
	public Client(String nom, String prenom, List<Jeu> listeJeux) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.listeJeux = listeJeux;
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
	public List<Jeu> getListeJeux() {
		return listeJeux;
	}
	public void setListeJeux(List<Jeu> listeJeux) {
		this.listeJeux = listeJeux;
	}
	
	
	

}