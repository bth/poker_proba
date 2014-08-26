package fr.entrecode.poker_proba;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.LinearLayout;


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

}
