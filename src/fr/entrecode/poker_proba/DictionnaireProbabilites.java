package fr.entrecode.poker_proba;

import java.util.HashMap;
import java.util.Map;

public class DictionnaireProbabilites {
	
	Map<String, Map<Integer, Float>> dictionnaire = new HashMap<String, Map<Integer,Float>>();
	
	private DictionnaireProbabilites(){
		//                  id     2       3       4       5       6       7       8       9      10
		ajouterProbabilite("aa", 85.30f, 73.40f, 63.90f, 55.90f, 49.20f, 43.60f, 38.80f, 34.70f, 31.10f);
		ajouterProbabilite("kk", 82.40f, 68.90f, 58.20f, 49.80f, 43.00f, 37.50f, 32.90f, 29.20f, 26.10f);
	}
	
	private static DictionnaireProbabilites instance = new DictionnaireProbabilites(); 
	
	public static DictionnaireProbabilites getInstance() {
		return instance;
	}
	
	private void ajouterProbabilite(String identifiant, float p2, float p3, float p4, float p5, float p6, float p7, float p8, float p9, float p10) {
		if(!dictionnaire.containsKey(identifiant)) {
			Map<Integer, Float> probabilites = new HashMap<Integer, Float>();
			probabilites.put(2, p2);
			probabilites.put(3, p3);
			probabilites.put(4, p4);
			probabilites.put(5, p5);
			probabilites.put(6, p6);
			probabilites.put(7, p7);
			probabilites.put(8, p8);
			probabilites.put(9, p9);
			probabilites.put(10, p10);
			dictionnaire.put(identifiant, probabilites);
		}
	}

}
