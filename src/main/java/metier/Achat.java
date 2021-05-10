package metier;

import java.time.LocalDate;

public class Achat {

	private String jeu, boutique;
	private double prix;
	private LocalDate date;
	public Achat(String jeu, String boutique, double prix, String date) {
		this.jeu = jeu;
		this.boutique = boutique;
		this.prix = prix;
		this.date = LocalDate.parse(date);
	}
	public String getJeu() {
		return jeu;
	}
	public void setJeu(String jeu) {
		this.jeu = jeu;
	}
	public String getBoutique() {
		return boutique;
	}
	public void setBoutique(String boutique) {
		this.boutique = boutique;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
	
	
	
	
}
