package fr.entrecode.poker_proba;

public class Carte {
	
	public static enum Hauteur {
		AS,
		ROI,
		DAME,
		VALET,
		DIX,
		NEUF,
		HUIT,
		SEPT,
		SIX,
		CINQ,
		QUATRE,
		TROIS,
		DEUX,
	}
	
	public static enum Couleur {
		COEUR,
		PIQUE,
		TREFLE,
		CARREAU
	}
	
	protected Hauteur hauteur;	
	protected Couleur couleur;
	
	public Carte(Hauteur hauteur, Couleur couleur) {
		setHauteur(hauteur);
		setCouleur(couleur);
	}
	
	public Hauteur getHauteur() {
		return hauteur;
	}
	public void setHauteur(Hauteur hauteur) {
		this.hauteur = hauteur;
	}
	public Couleur getCouleur() {
		return couleur;
	}
	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}
}
