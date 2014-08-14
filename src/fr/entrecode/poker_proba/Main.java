package fr.entrecode.poker_proba;

public class Main {
	
	private Carte carteA;
	private Carte carteB;
	private float probabilite;
	
	public Main(Carte carteA, Carte carteB) {
		this.carteA = carteA;
		this.carteB = carteB;
	}
	
	public Carte getCarteA() {
		return carteA;
	}
	public void setCarteA(Carte carteA) {
		this.carteA = carteA;
	}
	public Carte getCarteB() {
		return carteB;
	}
	public void setCarteB(Carte carteB) {
		this.carteB = carteB;
	}
	public float getProbabilite() {
		// Série 1
			  if (carteA.getHauteur() == Carte.Hauteur.AS &&
			      carteB.getHauteur() == Carte.Hauteur.AS &&
			      carteA.getCouleur() != carteB.getCouleur())
			      probabilite = 31.1f;
		else if (carteA.getHauteur() == Carte.Hauteur.ROI &&
			      carteB.getHauteur() == Carte.Hauteur.ROI &&
			      carteA.getCouleur() != carteB.getCouleur())
			      probabilite = 26.0f;
		else if (carteA.getHauteur() == Carte.Hauteur.DAME &&
			      carteB.getHauteur() == Carte.Hauteur.DAME &&
			      carteA.getCouleur() != carteB.getCouleur())
			      probabilite = 22.2f;
		else if (carteA.getHauteur() == Carte.Hauteur.AS &&
			      carteB.getHauteur() == Carte.Hauteur.ROI &&
			      carteA.getCouleur() == carteB.getCouleur())
			      probabilite = 20.6f;
		else if (carteA.getHauteur() == Carte.Hauteur.VALET &&
			      carteB.getHauteur() == Carte.Hauteur.VALET &&
			      carteA.getCouleur() != carteB.getCouleur())
			      probabilite = 19.3f;
		else if (carteA.getHauteur() == Carte.Hauteur.AS &&
			      carteB.getHauteur() == Carte.Hauteur.DAME &&
			      carteA.getCouleur() == carteB.getCouleur())
			      probabilite = 19.2f;
		else if (carteA.getHauteur() == Carte.Hauteur.ROI &&
			      carteB.getHauteur() == Carte.Hauteur.DAME &&
			      carteA.getCouleur() == carteB.getCouleur())
			      probabilite = 18.6f;
		else if (carteA.getHauteur() == Carte.Hauteur.AS &&
			      carteB.getHauteur() == Carte.Hauteur.VALET &&
			      carteA.getCouleur() == carteB.getCouleur())
			      probabilite = 18.1f;
		else if (carteA.getHauteur() == Carte.Hauteur.ROI &&
			      carteB.getHauteur() == Carte.Hauteur.VALET &&
			      carteA.getCouleur() == carteB.getCouleur())
			      probabilite = 17.6f;
		else if (carteA.getHauteur() == Carte.Hauteur.AS &&
			      carteB.getHauteur() == Carte.Hauteur.DIX &&
			      carteA.getCouleur() == carteB.getCouleur())
			      probabilite = 17.4f;
		else if (carteA.getHauteur() == Carte.Hauteur.AS &&
			      carteB.getHauteur() == Carte.Hauteur.ROI &&
			      carteA.getCouleur() != carteB.getCouleur())
			      probabilite = 17.1f;

		// Série 2
		else if (carteA.getHauteur() == Carte.Hauteur.DIX &&
			      carteB.getHauteur() == Carte.Hauteur.DIX &&
			      carteA.getCouleur() != carteB.getCouleur())
			      probabilite = 17.1f;
		else if (carteA.getHauteur() == Carte.Hauteur.DAME &&
			      carteB.getHauteur() == Carte.Hauteur.VALET &&
			      carteA.getCouleur() == carteB.getCouleur())
			      probabilite = 17.1f;
		else if (carteA.getHauteur() == Carte.Hauteur.ROI &&
			      carteB.getHauteur() == Carte.Hauteur.DIX &&
			      carteA.getCouleur() == carteB.getCouleur())
			      probabilite = 16.9f;
		else if (carteA.getHauteur() == Carte.Hauteur.VALET &&
			      carteB.getHauteur() == Carte.Hauteur.DIX &&
			      carteA.getCouleur() == carteB.getCouleur())
			      probabilite = 16.6f;
		else if (carteA.getHauteur() == Carte.Hauteur.DAME &&
			      carteB.getHauteur() == Carte.Hauteur.DIX &&
			      carteA.getCouleur() == carteB.getCouleur())
			      probabilite = 16.5f;
		else if (carteA.getHauteur() == Carte.Hauteur.AS &&
			      carteB.getHauteur() == Carte.Hauteur.DAME &&
			      carteA.getCouleur() != carteB.getCouleur())
			      probabilite = 15.5f;
		else if (carteA.getHauteur() == Carte.Hauteur.NEUF &&
			      carteB.getHauteur() == Carte.Hauteur.NEUF &&
			      carteA.getCouleur() != carteB.getCouleur())
			      probabilite = 15.5f;
		else if (carteA.getHauteur() == Carte.Hauteur.AS &&
			      carteB.getHauteur() == Carte.Hauteur.NEUF &&
			      carteA.getCouleur() == carteB.getCouleur())
			      probabilite = 15.3f;
		else if (carteA.getHauteur() == Carte.Hauteur.ROI &&
			      carteB.getHauteur() == Carte.Hauteur.DAME &&
			      carteA.getCouleur() != carteB.getCouleur())
			      probabilite = 15.0f;
		else if (carteA.getHauteur() == Carte.Hauteur.DIX &&
			      carteB.getHauteur() == Carte.Hauteur.NEUF &&
			      carteA.getCouleur() == carteB.getCouleur())
			      probabilite = 14.8f;
		else if (carteA.getHauteur() == Carte.Hauteur.ROI &&
			      carteB.getHauteur() == Carte.Hauteur.NEUF &&
			      carteA.getCouleur() == carteB.getCouleur())
			      probabilite = 14.8f;
			  
		// Série 3
		else if (carteA.getHauteur() == Carte.Hauteur.AS &&
			      carteB.getHauteur() == Carte.Hauteur.HUIT &&
			      carteA.getCouleur() == carteB.getCouleur())
			      probabilite = 14.7f;
		else if (carteA.getHauteur() == Carte.Hauteur.VALET &&
			      carteB.getHauteur() == Carte.Hauteur.NEUF &&
			      carteA.getCouleur() == carteB.getCouleur())
			      probabilite = 14.5f;
		else if (carteA.getHauteur() == Carte.Hauteur.DAME &&
			      carteB.getHauteur() == Carte.Hauteur.NEUF &&
			      carteA.getCouleur() == carteB.getCouleur())
			      probabilite = 14.5f;
		else if (carteA.getHauteur() == Carte.Hauteur.AS &&
			      carteB.getHauteur() == Carte.Hauteur.CINQ &&
			      carteA.getCouleur() == carteB.getCouleur())
			      probabilite = 14.4f;
		else if (carteA.getHauteur() == Carte.Hauteur.HUIT &&
			      carteB.getHauteur() == Carte.Hauteur.HUIT &&
			      carteA.getCouleur() == carteB.getCouleur())
			      probabilite = 14.4f;
		else if (carteA.getHauteur() == Carte.Hauteur.AS &&
			      carteB.getHauteur() == Carte.Hauteur.SEPT &&
			      carteA.getCouleur() == carteB.getCouleur())
			      probabilite = 14.2f;
		else if (carteA.getHauteur() == Carte.Hauteur.AS &&
			      carteB.getHauteur() == Carte.Hauteur.VALET &&
			      carteA.getCouleur() != carteB.getCouleur())
			      probabilite = 14.2f;
		else if (carteA.getHauteur() == Carte.Hauteur.AS &&
			      carteB.getHauteur() == Carte.Hauteur.QUATRE &&
			      carteA.getCouleur() == carteB.getCouleur())
			      probabilite = 14.1f;
		else if (carteA.getHauteur() == Carte.Hauteur.AS &&
			      carteB.getHauteur() == Carte.Hauteur.TROIS &&
			      carteA.getCouleur() == carteB.getCouleur())
			      probabilite = 13.9f;
		else if (carteA.getHauteur() == Carte.Hauteur.AS &&
			      carteB.getHauteur() == Carte.Hauteur.SIX &&
			      carteA.getCouleur() == carteB.getCouleur())
			      probabilite = 13.9f;
		else if (carteA.getHauteur() == Carte.Hauteur.ROI &&
			      carteB.getHauteur() == Carte.Hauteur.VALET &&
			      carteA.getCouleur() != carteB.getCouleur())
			      probabilite = 13.9f;

			  
		return probabilite;
	}
	public void setProbabilite(float probabilite) {
		this.probabilite = probabilite;
	}

}
