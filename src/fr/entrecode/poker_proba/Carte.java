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
	
	public static Couleur couleurFromString(String couleurString) {
		Couleur couleur = Couleur.PIQUE;
		if (couleurString.equals("p")) {
			couleur = Couleur.PIQUE;
		}
		else if (couleurString.equals("c")) {
			couleur = Couleur.COEUR;
		}
		else if (couleurString.equals("ca")) {
			couleur = Couleur.CARREAU;
		}
		else if (couleurString.equals("t")) {
			couleur = Couleur.TREFLE;
		}
		return couleur;
	}
	
	public static Hauteur hauteurFromString(String hauteurString) {
		Hauteur hauteur = Hauteur.AS;
		if(hauteurString.equals("a")) {
			hauteur = Hauteur.AS;
		}
		else if(hauteurString.equals("k")) {
			hauteur = Hauteur.ROI;
		}
		else if(hauteurString.equals("q")) {
			hauteur = Hauteur.DAME;
		}
		else if(hauteurString.equals("j")) {
			hauteur = Hauteur.VALET;
		}
		else if(hauteurString.equals("10")) {
			hauteur = Hauteur.DIX;
		}
		else if(hauteurString.equals("9")) {
			hauteur = Hauteur.NEUF;
		}
		else if(hauteurString.equals("8")) {
			hauteur = Hauteur.HUIT;
		}
		else if(hauteurString.equals("7")) {
			hauteur = Hauteur.SEPT;
		}
		else if(hauteurString.equals("6")) {
			hauteur = Hauteur.SIX;
		}
		else if(hauteurString.equals("5")) {
			hauteur = Hauteur.CINQ;
		}
		else if(hauteurString.equals("4")) {
			hauteur = Hauteur.QUATRE;
		}
		else if(hauteurString.equals("3")) {
			hauteur = Hauteur.TROIS;
		}
		else if(hauteurString.equals("2")) {
			hauteur = Hauteur.DEUX;
		}
		return hauteur;
	}
	
	public static String stringFromCouleur(Couleur couleur) {
		String couleurString = "";
		switch (couleur) {
			case COEUR:
				couleurString = "c";
				break;
			
			case TREFLE:
				couleurString = "t";
				break;
				
			case PIQUE:
				couleurString = "p";
				break;
				
			case CARREAU:
				couleurString = "ca";
				break;
				
			default:
				break;
		}
		return couleurString;
	}
	
	public static String stringFromHauteur(Hauteur hauteur) {
		String hauteurString = "a";
		switch (hauteur) {
			case AS:
				hauteurString = "a";
				break;
			case ROI:
				hauteurString = "k";
				break;	
			case DAME:
				hauteurString = "q";
				break;
			case VALET:
				hauteurString = "j";
				break;
			case DIX:
				hauteurString = "10";
				break;
			case NEUF:
				hauteurString = "9";
				break;
			case HUIT:
				hauteurString = "8";
				break;
			case SEPT:
				hauteurString = "7";
				break;
			case SIX:
				hauteurString = "6";
				break;
			case CINQ:
				hauteurString = "5";
				break;
			case QUATRE:
				hauteurString = "4";
				break;
			case TROIS:
				hauteurString = "3";
				break;
			case DEUX:
				hauteurString = "2";
				break;
			default:
				break;
		}
		return hauteurString;
	}
	
	public Carte(Hauteur hauteur, Couleur couleur) {
		setHauteur(hauteur);
		setCouleur(couleur);
	}
	
	public String toString() {
		return stringFromCouleur(getCouleur()) + stringFromHauteur(getHauteur());
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
