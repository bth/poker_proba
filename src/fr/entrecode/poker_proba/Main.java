package fr.entrecode.poker_proba;

public class Main {
	
	private Carte carteA;
	private Carte carteB;
	private float probabilite = -1f;
	
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
	public float getProbabilite(int nombreJoueurs) {
		String clefMain = getClefMain();
		probabilite = DictionnaireProbabilites.getProbabilite(clefMain, nombreJoueurs);

		if(probabilite == -1f) {
			Carte carteTmp = carteA;
			carteA = carteB;
			carteB = carteTmp;
			probabilite = getProbabilite(nombreJoueurs);
		}
			  
		return probabilite;
	}
	public void setProbabilite(float probabilite) {
		this.probabilite = probabilite;
	}
	
	private String getClefMain() {
		String clef = "";
		clef = Carte.stringFromHauteur(carteA.getHauteur()) + Carte.stringFromHauteur(carteB.getHauteur());
		if (carteA.getCouleur() == carteB.getCouleur()) {
			clef += "s";
		}
		return clef;
	}

}
