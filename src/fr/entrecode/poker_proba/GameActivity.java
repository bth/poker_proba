package fr.entrecode.poker_proba;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.sax.TextElementListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class GameActivity extends Activity {
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        init();
    }
    
    private void init() {
    	
    	Carte carte1 = new Carte(Carte.Hauteur.AS, Carte.Couleur.PIQUE);
    	Carte carte2 = new Carte(Carte.Hauteur.ROI, Carte.Couleur.COEUR);
    	
    	Main main = new Main(carte1, carte2);
    	main.getProbabilite();
    	
    	LinearLayout listeCarte1 = (LinearLayout) findViewById(R.id.carte1);
    	LinearLayout listeCarte2 = (LinearLayout) findViewById(R.id.carte2);
    	remplirListe(listeCarte1, Carte.Couleur.PIQUE);
    	remplirListe(listeCarte2, Carte.Couleur.COEUR);
    	
    	afficherPourcentage(50);
    }
    
    private void remplirListe(ViewGroup liste, Carte.Couleur couleur) {
    	List<String> listePrefixesFigures = Arrays.asList("a", "k", "q", "j", "10", "9", "8", "7", "6", "5", "4", "3", "2");
    	String prefixeCouleur = "";
    	switch (couleur) {
			case COEUR:
				prefixeCouleur = "c";
				break;
			
			case TREFLE:
				prefixeCouleur = "t";
				break;
				
			case PIQUE:
				prefixeCouleur = "p";
				break;
				
			case CARREAU:
				prefixeCouleur = "ca";
				break;
				
			default:
				break;
		}
    	for (Iterator<String> iterateurPrefixeFigure = listePrefixesFigures.iterator(); iterateurPrefixeFigure.hasNext();) {
    		ajouterImageAListe(prefixeCouleur + iterateurPrefixeFigure.next(), liste);				
		}    	
    }
        
    private void ajouterImageAListe(String nomImage, ViewGroup liste) {
    	ImageView image = new ImageView(getApplicationContext());
    	int id = getResources().getIdentifier(nomImage, "drawable", getPackageName());
    	image.setImageResource(id);
    	image.setAdjustViewBounds(true);
    	liste.addView(image);
    }
    
    private void afficherPourcentage(float pourcentage) {
    	TextView pourcentageTexte = (TextView) findViewById(R.id.pourcentage);
    	pourcentageTexte.setText(String.valueOf(pourcentage) + "%");
    	int[] composantes = couleurDuPourcentage(pourcentage);
    	pourcentageTexte.setTextColor(Color.rgb(composantes[0], composantes[1], 0));
    }
    
    private int[] couleurDuPourcentage(float pourcentage) {    	
    	int composanteRouge = 0xFF;
    	int composanteVerte = 0xFF;
    	int valeurMax = 100;
    	composanteVerte = Math.round(pourcentage * (0xFF / valeurMax));
    	composanteRouge = 0xFF - Math.round(pourcentage * (0xFF / valeurMax));
    	int[] composantes = {composanteRouge, composanteVerte};
    	return composantes;
    }

}
